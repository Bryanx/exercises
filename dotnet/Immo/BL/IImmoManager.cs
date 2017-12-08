using System.Collections.Generic;
using IM.Domain;

namespace IM.BL {
    public interface IImmoManager {
        IEnumerable<Person> GetPersons();
        IEnumerable<Immo> GetImmos();
        IEnumerable<Immo> GetImmosBySold(bool state);
        IEnumerable<Immo> GetImmosByType(ImmoType type);
        Immo GetImmo(int id);
        void ChangeImmo(Immo immo);
        void ChangeImmoToSold(int immold);
        void CreateImmo(Immo immo);
        void RemovePerson(int personId);
    }
}