package dto;


public class ResultDTO {
    private String leftComandName;
    private String rightComandName;
    private String leftComandScore;
    private String rightComandScore;


    public ResultDTO() {
    }

    public String getLeftComandName() {
        return leftComandName;
    }

    public void setLeftComandName(String leftComandName) {
        this.leftComandName = leftComandName;
    }

    public String getRightComandName() {
        return rightComandName;
    }

    public void setRightComandName(String rightComandName) {
        this.rightComandName = rightComandName;
    }

    public String getLeftComandScore() {
        return leftComandScore;
    }

    public void setLeftComandScore(String leftComandScore) {
        this.leftComandScore = leftComandScore;
    }

    public String getRightComandScore() {
        return rightComandScore;
    }

    public void setRightComandScore(String rightComandScore) {
        this.rightComandScore = rightComandScore;
    }
}
