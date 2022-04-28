package chapter9;

    public class Manager extends  Employee {

        private String passWord;

        public Manager(String firstName, String lastName, String id, int salary, String passWord, String dateOfBirth) {

            super(firstName, lastName, id, salary, dateOfBirth);
            this.passWord = passWord;

        }

        public void setPassWord(String passWord) {
            this.passWord = passWord;
        }

        public String getPassWord() {
            return passWord;
        }


    }

