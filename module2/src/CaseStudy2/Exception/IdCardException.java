package CaseStudy2.Exception;

public class IdCardException extends Exception{
    public IdCardException(String message) {
        super(message);
    }

    public static String idCardException(String idCard) throws IdCardException {
        String regex="^\\d{3}\\s\\d{3}\\s\\d{3}$";
        if (idCard.matches(regex)) {
            return idCard;
        } else {
            throw new IdCardException("ID Card không hợp lệ");
        }
    }
}