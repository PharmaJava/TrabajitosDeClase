package OpenBootCamp;

public class CocheCRUDImpl implements CocheCRUD{


        @Override
        public void save() {
            System.out.println("save() method called");
        }
        @Override
        public void findAll() {
            System.out.println("findAll() method called");
        }
        @Override
        public void delete() {
            System.out.println("delete() method called");
        }

}
