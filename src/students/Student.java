package students;

import static org.apache.commons.lang3.ObjectUtils.compare;

/**
 * Created by M.Ben_Roberts on 11/28/16.
 */

class Student implements Comparable<Student>{

    private String firstName;
    private String lastName;
    private int score;

    public int compareTo(Student other){
        int last = this.lastName.compareTo(other.lastName);
        return last == 0 ? this.firstName.compareTo(other.firstName) : last;
    }

    Student(String firstName, String lastName, int score){
        this.setFirstName(firstName);
        this.setLastName(lastName);
        this.setScore(score);
    }

    private void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    private void setLastName(String lastName) {
        this.lastName = lastName;
    }

    private void setScore(int score) {
        this.score = score;
    }

    int getScore(){
        return score;
    }

    String getFullName(){
        return this.firstName + " " + this.lastName;
    }
}