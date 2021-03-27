package io.giodude.one888.Model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class FBTeamListModel {

    @SerializedName("data")
    @Expose
    private List<Datum> data = null;

    public class Datum{
        @SerializedName("id")
        @Expose
        private Integer id;
        @SerializedName("slug")
        @Expose
        private String slug;
        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("name_full")
        @Expose
        private String nameFull;
        @SerializedName("name_code")
        @Expose
        private String nameCode;
        @SerializedName("has_sub")
        @Expose
        private Boolean hasSub;
        @SerializedName("has_logo")
        @Expose
        private Boolean hasLogo;
        @SerializedName("logo")
        @Expose
        private String logo;
        @SerializedName("gender")
        @Expose
        private String gender;
        @SerializedName("country")
        @Expose
        private String country;

        public Datum(Integer id, String slug, String name, String nameFull, String nameCode, Boolean hasSub, Boolean hasLogo, String logo, String gender, String country) {
            this.id = id;
            this.slug = slug;
            this.name = name;
            this.nameFull = nameFull;
            this.nameCode = nameCode;
            this.hasSub = hasSub;
            this.hasLogo = hasLogo;
            this.logo = logo;
            this.gender = gender;
            this.country = country;
        }

        public Integer getId() {
            return id;
        }

        public String getSlug() {
            return slug;
        }

        public String getName() {
            return name;
        }

        public String getNameFull() {
            return nameFull;
        }

        public String getNameCode() {
            return nameCode;
        }

        public Boolean getHasSub() {
            return hasSub;
        }

        public Boolean getHasLogo() {
            return hasLogo;
        }

        public String getLogo() {
            return logo;
        }

        public String getGender() {
            return gender;
        }

        public String getCountry() {
            return country;
        }
    }

    public List<Datum> getData() {
        return data;
    }
}
