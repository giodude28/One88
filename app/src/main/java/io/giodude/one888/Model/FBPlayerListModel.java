package io.giodude.one888.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FBPlayerListModel {
    @SerializedName("data")
    @Expose
    private List<Datum> data = null;

    public class Datum{
        @SerializedName("id")
        @Expose
        private String id;
        @SerializedName("slug")
        @Expose
        private String slug;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("name_short")
        @Expose
        private String nameShort;
        @SerializedName("photo")
        @Expose
        private String photo;
        @SerializedName("position_name")
        @Expose
        private String positionName;
        @SerializedName("weight")
        @Expose
        private String weight;
        @SerializedName("age")
        @Expose
        private String age;
        @SerializedName("date_birth_at")
        @Expose
        private String dateBirthAt;
        @SerializedName("height")
        @Expose
        private String height;
        @SerializedName("shirt_number")
        @Expose
        private String shirtNumber;
        @SerializedName("ability")
        @Expose
        private List<Ability> ability = null;
        @SerializedName("sport")
        @Expose
        private Sport sport;
        @SerializedName("main_team")
        @Expose
        private MainTeam mainTeam;
        @SerializedName("flag")
        @Expose
        private String flag;

        public Datum(String id, String slug, String name, String nameShort, String photo,String positionName, String weight, String age, String dateBirthAt, String height, String shirtNumber,List<Ability> ability, Sport sport, MainTeam mainTeam,String flag) {
            this.id = id;
            this.slug = slug;
            this.name = name;
            this.nameShort = nameShort;
            this.photo = photo;
            this.positionName = positionName;
            this.weight = weight;
            this.age = age;
            this.dateBirthAt = dateBirthAt;
            this.height = height;
            this.shirtNumber = shirtNumber;
            this.ability = ability;
            this.sport = sport;
            this.mainTeam = mainTeam;
            this.flag = flag;
        }

        public String getFlag() {
            return flag;
        }

        public class Ability{
            @SerializedName("name")
            @Expose
            private String name;
            @SerializedName("value")
            @Expose
            private String value;
            @SerializedName("full_average")
            @Expose
            private String fullAverage;

            public Ability(String name, String value, String fullAverage) {
                this.name = name;
                this.value = value;
                this.fullAverage = fullAverage;
            }

            public String getName() {
                return name;
            }

            public String getValue() {
                return value;
            }

            public String getFullAverage() {
                return fullAverage;
            }
        }

        public class Sport{
            @SerializedName("id")
            @Expose
            private String id;
            @SerializedName("slug")
            @Expose
            private String slug;
            @SerializedName("name")
            @Expose
            private String name;

            public Sport(String id, String slug, String name) {
                this.id = id;
                this.slug = slug;
                this.name = name;
            }

            public String getId() {
                return id;
            }

            public String getSlug() {
                return slug;
            }

            public String getName() {
                return name;
            }
        }

        public class MainTeam{

            @SerializedName("id")
            @Expose
            private String id;
            @SerializedName("slug")
            @Expose
            private String slug;
            @SerializedName("name")
            @Expose
            private String name;
            @SerializedName("name_short")
            @Expose
            private String nameShort;
            @SerializedName("name_full")
            @Expose
            private String nameFull;
            @SerializedName("name_code")
            @Expose
            private String nameCode;
            @SerializedName("has_sub")
            @Expose
            private String hasSub;
            @SerializedName("has_logo")
            @Expose
            private String hasLogo;
            @SerializedName("logo")
            @Expose
            private String logo;
            @SerializedName("gender")
            @Expose
            private String gender;
            @SerializedName("is_nationality")
            @Expose
            private String isNationality;
            @SerializedName("country_code")
            @Expose
            private String countryCode;
            @SerializedName("country")
            @Expose
            private String country;
            @SerializedName("flag")
            @Expose
            private String flag;
            @SerializedName("foundation")
            @Expose
            private String foundation;
            @SerializedName("details")
            @Expose
            private Object details;

            public MainTeam(String id, String slug, String name, String nameShort, String nameFull, String nameCode, String hasSub, String hasLogo, String logo, String gender, String isNationality, String countryCode, String country, String flag, String foundation, Object details) {
                this.id = id;
                this.slug = slug;
                this.name = name;
                this.nameShort = nameShort;
                this.nameFull = nameFull;
                this.nameCode = nameCode;
                this.hasSub = hasSub;
                this.hasLogo = hasLogo;
                this.logo = logo;
                this.gender = gender;
                this.isNationality = isNationality;
                this.countryCode = countryCode;
                this.country = country;
                this.flag = flag;
                this.foundation = foundation;
                this.details = details;
            }
            public String getId() {
                return id;
            }

            public String getSlug() {
                return slug;
            }

            public String getName() {
                return name;
            }
            public String getNameShort() {
                return nameShort;
            }

            public String getNameFull() {
                return nameFull;
            }

            public String getNameCode() {
                return nameCode;
            }

            public String getHasSub() {
                return hasSub;
            }

            public String getHasLogo() {
                return hasLogo;
            }

            public String getLogo() {
                return logo;
            }

            public String getGender() {
                return gender;
            }

            public String getNationality() {
                return isNationality;
            }

            public String getCountryCode() {
                return countryCode;
            }

            public String getCountry() {
                return country;
            }

            public String getFlag() {
                return flag;
            }

            public String getFoundation() {
                return foundation;
            }

            public Object getDetails() {
                return details;
            }
        }

        public String getId() {
            return id;
        }

        public String getSlug() {
            return slug;
        }

        public String getName() {
            return name;
        }

        public String getNameShort() {
            return nameShort;
        }

        public String getPhoto() {
            return photo;
        }


        public String getPositionName() {
            return positionName;
        }

        public String getWeight() {
            return weight;
        }

        public String getAge() {
            return age;
        }

        public String getDateBirthAt() {
            return dateBirthAt;
        }

        public String getHeight() {
            return height;
        }

        public String getShirtNumber() {
            return shirtNumber;
        }

        public List<Ability> getAbility() {
            return ability;
        }

        public Sport getSport() {
            return sport;
        }

        public MainTeam getMainTeam() {
            return mainTeam;
        }
    }



    public List<Datum> getData() {
        return data;
    }
}
