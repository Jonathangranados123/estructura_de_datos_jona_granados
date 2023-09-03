package tarea2.futbol.process;

public class  FootBall {

        private String name;
        private int number;
        private boolean isCaptain;

        /**
         * Constructor para inicializar un objeto FootBallPlayer.
         *
         * @param name      El nombre del jugador de fútbol.
         * @param number    El número del jugador de fútbol.
         * @param isCaptain Indica si el jugador es el capitán del equipo.
         */
        public FootBall(String name, int number, boolean isCaptain) {
            this.name = name;
            this.number = number;
            this.isCaptain = isCaptain;
        }

        /**
         * Obtiene el nombre del jugador de fútbol.
         *
         * @return El nombre del jugador de fútbol.
         */
        public String getName() {
            return name;
        }

        /**
         * Obtiene el número del jugador de fútbol.
         *
         * @return El número del jugador de fútbol.
         */
        public int getNumber() {
            return number;
        }

        /**
         * Verifica si el jugador es el capitán del equipo.
         *
         * @return true si el jugador es el capitán, false en caso contrario.
         */
        public boolean isCaptain () {
            return isCaptain;
        }

        /**
         * Representación en forma de cadena del jugador de fútbol.
         *
         * @return Una cadena que representa al jugador de fútbol, incluyendo su estado de capitán si aplica.
         */
        public String toString() {
            return (isCaptain ? " *Capitan* " : "") + "Nombre: " + name + "/ Numero: " + number;
        }


    }




