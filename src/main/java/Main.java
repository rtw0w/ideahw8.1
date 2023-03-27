public class Main {
    public static void main(String[] args) {
        Post post = new Post();
        post.name = "Дмитрий";
        post.passport = "4444 № 44444444";
        post.patronymic = "Александрович";
        post.phone = "+7 (999)-999-99-99";
        post.surname = "Сергеев";
        post.subscription = "true";
        post.birthday = new FormDate();
        post.birthday.day = "11";
        post.birthday.month = "01";
        post.birthday.year = "1999";
    }

}

