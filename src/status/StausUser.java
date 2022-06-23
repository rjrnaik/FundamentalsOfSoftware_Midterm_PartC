/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package status;

/**
 * MidTerm-Exam
 * @author srinivsi
 * * @author Rajrishi Naik
 */
public class StausUser 
{
//   public void statusDetail(String code)
//{
//switch(code.toUpperCase())
//        {
//        case "ZERO": System.out.println("REJECTED");
//        break;
//        case "ONE": System.out.println("PENDING");
//        break;
//        case "TWO":
//        System.out.println("PROCESSING");
//        break;
//        case "THREE": 
//            System.out.println("APPROVED");
//        break;
//        default:
//         System.out.println("NOT VALID CODE");
//        break;
//        }
//}
    
    public enum Code {
        ZERO, ONE, TWO, THREE, OTHER
    };
 
    public enum CodeStatus{
        REJECTED, PENDING, PROCESSING, APPROVED, NOTVALID
    }
    
    private Code code;
    private CodeStatus codeStatus;

    public StausUser(Code code, CodeStatus codeStatus) {
        this.code = code;
        this.codeStatus = codeStatus;
    }
    /**
     * @return the code
     */
    public Code getCode() {
        return code;
    }

    /**
     * @param code the code to set
     */
    public void setCode(Code code) {
        this.code = code;
    }

    /**
     * @return the codeStatus
     */
    public CodeStatus getCodeStatus() {
        return codeStatus;
    }

    /**
     * @param codeStatus the codeStatus to set
     */
    public void setCodeStatus(CodeStatus codeStatus) {
        this.codeStatus = codeStatus;
    }
    
    
}
