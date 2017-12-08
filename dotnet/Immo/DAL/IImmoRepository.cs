using System.Collections.Generic;
using IM.Domain;

namespace IM.DAL {
    public interface IImmoRepository {
        IEnumerable<Person> ReadPersons();
        IEnumerable<Immo> ReadImmos();
        IEnumerable<Immo> ReadImmosBySold(bool state);
        IEnumerable<Immo> ReadImmosByType(ImmoType type);
        Immo ReadImmo(int id);
        void UpdateImmo(Immo immo);
        void UpdateImmoToSold(int immold);
        void AddImmo(Immo immo);
        void DeletePerson(int personId);
    }
}