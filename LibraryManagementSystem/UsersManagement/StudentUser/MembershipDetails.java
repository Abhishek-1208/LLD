package UsersManagement.StudentUser;

public class MembershipDetails {
    public String membershipId;
    public Boolean isMembershipActive;
    public String membershipStartDate;
    public String membershipEndDate;

    public MembershipDetails(MembershipDetailsBuilder args) {
        this.membershipId = args.membershipId;
        this.isMembershipActive = args.isMembershipActive;
        this.membershipStartDate = args.membershipStartDate;
        this.membershipEndDate = args.membershipEndDate;
    }

    public static class MembershipDetailsBuilder {
        public String membershipId;
        public Boolean isMembershipActive;
        public String membershipStartDate;
        public String membershipEndDate;

        public MembershipDetailsBuilder MembershipId(String membershipId) {
            this.membershipId = membershipId;
            return this;
        }

        public MembershipDetailsBuilder IsMembershipActive(Boolean isMembershipActive) {
            this.isMembershipActive = isMembershipActive;
            return this;
        }
        public MembershipDetailsBuilder MembershipStartDate(String membershipStartDate) {
            this.membershipStartDate = membershipStartDate;
            return this;
        }

        public MembershipDetailsBuilder MembershipEndDate(String membershipEndDate) {
            this.membershipEndDate = membershipEndDate;
            return this;
        }

        public MembershipDetails build() {
            return new MembershipDetails(this);
        }
    }

    public String getMembershipId() {
        return membershipId;
    }

    public void setMembershipId(String membershipId) {
        this.membershipId = membershipId;
    }

    public Boolean getMembershipActive() {
        return isMembershipActive;
    }

    public void setMembershipActive(Boolean membershipActive) {
        isMembershipActive = membershipActive;
    }

    public String getMembershipStartDate() {
        return membershipStartDate;
    }

    public void setMembershipStartDate(String membershipStartDate) {
        this.membershipStartDate = membershipStartDate;
    }

    public String getMembershipEndDate() {
        return membershipEndDate;
    }

    public void setMembershipEndDate(String membershipEndDate) {
        this.membershipEndDate = membershipEndDate;
    }
}
