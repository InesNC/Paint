public class Colors {

    public enum HappierColors {
        A1(new org.academiadecodigo.simplegraphics.graphics.Color(175, 113, 86)),
        A2(new org.academiadecodigo.simplegraphics.graphics.Color(171, 78, 104)),
        A3(new org.academiadecodigo.simplegraphics.graphics.Color(226, 55, 69)),
        A4(new org.academiadecodigo.simplegraphics.graphics.Color(157, 145, 113)),
        B1(new org.academiadecodigo.simplegraphics.graphics.Color(135, 206, 250));

        final org.academiadecodigo.simplegraphics.graphics.Color color;
        final HappierColors[] happyArr;

        HappierColors(org.academiadecodigo.simplegraphics.graphics.Color color) {
            happyArr = HappierColors.values();
            this.color = color;
        }

        public org.academiadecodigo.simplegraphics.graphics.Color getColor() {
            return color;
        }

    }
}

