import java.util.HashMap;
import java.util.List;
import java.util.ArrayList;

public class Token {
    HashMap<Integer, List<String>> tokens = new HashMap<>();

    public Token() {
        tokens.put(1, List.of("output"));
        tokens.put(2, List.of("on"));
        tokens.put(3, List.of("create"));
        tokens.put(4, List.of("elseif"));
        tokens.put(5, List.of("me"));
        tokens.put(6, List.of("until"));
        tokens.put(7, List.of("public"));
        tokens.put(8, List.of("private"));
        tokens.put(9, List.of("alert"));
        tokens.put(10, List.of("detect"));
        tokens.put(11, List.of("always"));
        tokens.put(12, List.of("check"));
        tokens.put(13, List.of("parent"));
        tokens.put(14, List.of("blueprint"));
        tokens.put(15, List.of("system"));
        tokens.put(16, List.of("is"));
        tokens.put(17, List.of("cast"));
        tokens.put(18, List.of("input"));
        tokens.put(19, List.of("say"));
        tokens.put(20, List.of("now"));
        tokens.put(21, List.of("while"));
        tokens.put(22, List.of("package"));
        tokens.put(23, List.of("times"));
        tokens.put(24, List.of("repeat"));
        tokens.put(25, List.of("else"));
        tokens.put(26, List.of("returns"));
        tokens.put(27, List.of("return"));
        tokens.put(28, List.of("and"));
        tokens.put(29, List.of("or"));
        tokens.put(30, List.of("undefined"));
        tokens.put(31, List.of("shared"));
        tokens.put(32, List.of("action"));
        tokens.put(33, List.of("integer"));
        tokens.put(34, List.of("number"));
        tokens.put(35, List.of("text"));
        tokens.put(36, List.of("boolean"));
        tokens.put(37, List.of("use"));
        tokens.put(38, List.of("not", "Not"));
        tokens.put(39, List.of("not=", "Not="));
        tokens.put(40, List.of("if"));
        tokens.put(41, List.of("end"));
        tokens.put(42, List.of("class"));
        tokens.put(43, List.of("true", "false"));

        tokens.put(44, List.of("mod"));
        tokens.put(45, List.of("."));
        tokens.put(46, List.of(","));
        tokens.put(47, List.of("="));
        tokens.put(48, List.of(">"));
        tokens.put(49, List.of(">="));
        tokens.put(50, List.of("<"));
        tokens.put(51, List.of("<="));
        tokens.put(52, List.of("+"));
        tokens.put(53, List.of("-"));
        tokens.put(54, List.of("*"));
        tokens.put(55, List.of("/"));
        tokens.put(56, List.of(":"));
        tokens.put(57, List.of("["));
        tokens.put(58, List.of("]"));
        tokens.put(59, List.of("("));
        tokens.put(60, List.of(")"));
        tokens.put(61, List.of("\""));

    }


}