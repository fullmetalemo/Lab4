package characters;

import Extra.Place;
import Extra.Rotation;

import java.util.Objects;

public class ACharacters {

    public abstract class ACharacter implements CharactersInt {
        protected String name;
        protected Rotation rotation;
        protected Place place;

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public boolean equals(Object object) {
            if (this == object) return true;
            if (object == null || getClass() != object.getClass()) return false;
            ACharacter aCharacter = (ACharacter) object;
            return Objects.equals(name, aCharacter.name);
        }

        @Override
        public String toString() {
            return "Persons: " +
                    "name = " + name;
        }

        public String getName() {
            return this.name = name;
        }

        public Rotation setRotation(Rotation rotation) {
            return this.rotation = rotation;
        }

        public Place getPlace() {
            return place;
        }

        public Place setPlace(Place place) {
            return this.place = place;
        }

    }
}
