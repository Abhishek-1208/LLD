package UsersManagement.StudentUser;

import UsersManagement.User.User;
import java.util.List;
public class Student extends User {
    public String studentId;
    public Integer outstandingFines;
    public MembershipDetails membershipDetail;
    public List<String> borrowedBooksId;

    private Student(StudentBuilder args) {
        super(args);
        this.studentId = args.studentId;
        this.outstandingFines = args.outstandingFines;
        this.membershipDetail = args.membershipDetail;
        this.borrowedBooksId = args.borrowedBooksId;
    }

    public static class StudentBuilder extends UserBuilder {
        public String studentId;
        public Integer outstandingFines;
        public MembershipDetails membershipDetail;
        public List<String> borrowedBooksId;

        public StudentBuilder StudentId(String studentId) {
            this.studentId = studentId;
            return this;
        }

        public StudentBuilder OutstandingFines(Integer outstandingFines) {
            this.outstandingFines = outstandingFines;
            return this;
        }

        public StudentBuilder MembershipStatus(MembershipDetails membershipStatus) {
            this.membershipDetail = membershipStatus;
            return this;
        }

        public StudentBuilder BorrowedBooksId(List<String> borrowedBooksId) {
            this.borrowedBooksId = borrowedBooksId;
            return this;
        }

        public Student build() {
            return new Student(this);
        }
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public Integer getOutstandingFines() {
        return outstandingFines;
    }

    public void setOutstandingFines(Integer outstandingFines) {
        this.outstandingFines = outstandingFines;
    }

    public MembershipDetails getMembershipStatus() {
        return membershipDetail;
    }

    public void setMembershipStatus(MembershipDetails membershipStatus) {
        this.membershipDetail = membershipStatus;
    }

    public List<String> getBorrowedBooksId() {
        return borrowedBooksId;
    }

    public void setBorrowedBooksId(List<String> borrowedBooksId) {
        this.borrowedBooksId = borrowedBooksId;
    }

}
