package chapter9;

    public class Manager extends  Employee {

        private String passWord;
        private String dateOfBirth;

        public Manager(String firstName, String lastName, String id, int salary,String passWord, String dateOfBirth) {

            super(firstName, lastName, id, salary,dateOfBirth);
            this.passWord = passWord;

        }
        public  void setPassWord(String passWord){
            this.passWord = passWord;
        }
        public String getPassWord(){
            return  passWord;
        }
        @Override
        public double getRaise(){
            return  (getDiscount() / 0.01) * getSalary() ;
        }
        public void setDateOfBirth(int day, int month, int year){
            dateOfBirth = day + "/" + month + "/" + year;
        }
        public String getDateOfBirth(){
            return  dateOfBirth;
        }
    }
