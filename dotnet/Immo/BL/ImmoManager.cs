using System.Collections.Generic;
using IM.DAL;
using IM.DAL.EF;
using IM.Domain;

namespace IM.BL {
    public class ImmoManager : IImmoManager {
        private IImmoRepository repo;
        public ImmoManager() {
            this.repo = new ImmoRepository();
        }

        public IEnumerable<Person> GetPersons() {
            return repo.ReadPersons();
        }

        public IEnumerable<Immo> GetImmos() {
            return repo.ReadImmos();
        }

        public IEnumerable<Immo> GetImmosBySold(bool state) {
            return repo.ReadImmosBySold(state);
        }

        public IEnumerable<Immo> GetImmosByType(ImmoType type) {
            return repo.ReadImmosByType(type);
        }

        public Immo GetImmo(int id) {
            return repo.ReadImmo(id);
        }

        public void ChangeImmo(Immo immo) {
            repo.UpdateImmo(immo);
        }

        public void ChangeImmoToSold(int immold) {
            repo.UpdateImmoToSold(immold);
        }

        public void CreateImmo(Immo immo) {
            repo.AddImmo(immo);
        }

        public void RemovePerson(int personId) {
            repo.DeletePerson(personId);
        }
    }
}