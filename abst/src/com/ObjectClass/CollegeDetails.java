package com.ObjectClass;
//if we use getters and setters we can not compare object bec we can not send objects to compare so we use constructor
public class CollegeDetails {
    private int collegeId;
    private String collegeName;

    public CollegeDetails(int collegeId,String collegeName){
        this.collegeId=collegeId;
        this.collegeName=collegeName;

    }

    @Override
    public String toString() {
        return "college id is "+collegeId+"and college name is "+collegeName;
    }

    @Override
    public int hashCode() {
        return collegeId;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj ==null){
            return false;
        }
        if(obj instanceof CollegeDetails){
            CollegeDetails collegeDetails= (CollegeDetails) obj;
            {
                if(this.collegeId==collegeDetails.collegeId && this.collegeName.equals(collegeDetails.collegeName)){

                    return true;
                }
            }
        }
        return false;
    }
}
