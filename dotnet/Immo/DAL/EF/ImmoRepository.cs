using System;
using System.Collections.Generic;
using System.Data.Entity;
using System.Data.Entity.Migrations;
using System.Linq;
using IM.Domain;

namespace IM.DAL.EF {
    public class ImmoRepository : IImmoRepository {
        private ImmoDbContext ctx;

        public ImmoRepository() {
            ctx = new ImmoDbContext();
        }

        public IEnumerable<Person> ReadPersons() {
            return ctx.Persons.AsEnumerable();
        }

        public IEnumerable<Immo> ReadImmos() {
            return ctx.Immos.AsEnumerable();
        }

        public IEnumerable<Immo> ReadImmosBySold(bool state) {
            return ctx.Immos.Where(i => i.Sold == state);
        }

        public IEnumerable<Immo> ReadImmosByType(ImmoType type) {
            return ctx.Immos.Where(i => i.Type == type);
        }

        public Immo ReadImmo(int id) {
            Immo result = null;
            if (ctx.Lazyloading) {
                List<Person> eigenaren = ctx.Persons.ToList();
                foreach (var eigenaar in eigenaren) {
                    foreach (var immo in eigenaar.Panden) {
                        if (immo.Id == id) result = immo;
                    }
                }
            } else { //EagerLoading
                result = ctx.Immos.Include(i => i.Eigenaar).First(i => i.Id == id);
            }
            return result;
        }

        public void UpdateImmo(Immo immo) {
            ctx.Immos.AddOrUpdate(immo);
            ctx.SaveChanges();
        }

        public void UpdateImmoToSold(int immold) {
            UpdateImmo(ctx.Immos.Find(immold));
        }

        public void AddImmo(Immo immo) {
            immo.Id = ctx.Immos.Max(i => i.Id) + 1;
            UpdateImmo(immo);
        }

        public void DeletePerson(int personId) {
            Person person = ctx.Persons.Include(p => p.Panden).First(p => p.PersonNumber == personId);
            List<Int32> getallen = person.Panden.Select(i => i.Id).ToList();
            foreach (int i in getallen) {
                ctx.Immos.Remove(ctx.Immos.Find(i));
            }
            ctx.Persons.Remove(person);
            ctx.SaveChanges();
        }
    }
}