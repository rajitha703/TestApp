package com.springelasticsearch.app;

import java.util.List;
import java.util.Map;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;
import org.springframework.data.elasticsearch.annotations.Field;
import org.springframework.data.elasticsearch.annotations.FieldType;

import lombok.Data;

@Data
@Document(indexName = "entities", type = "entities")
public class Show implements Entity {

    @Field(type = FieldType.String)
    private String id;
    @Field(type = FieldType.String)
    private String title;
    @Field(type = FieldType.String)
    private String actor;
    @Field(type = FieldType.String)
    private String director;
    @Field(type = FieldType.String)
    private String genre;
    @Field(type = FieldType.String)
    private String language;

    Show(String id, String title, String actor, String director, String genre, String language) {
        this.id = id;
        this.title = title;
        this.actor = actor;
        this.director = director;
        this.genre = genre;
        this.language = language;
    }
//    private ShowType showType;
//    private String yearOfRelease;
//    private String duration;
//    private String certification;
//    private String print;
//    private String language;
//    private String trailerLink;
//    private String imagesLink;
//    private Integer matchPercentage;
//    private String synopsis;
//    private String[] leadActors;
//    private String director;
//    private String genre;
//    private String imdbRating;
//    private String rottenTomatoesRating;
//    private String[] awards;
//    private String subtitlesLink;
//    private int noOfSeasons;
//    private Map<ServiceType, List<Provider>> serviceTypeListMap;

    private Show(){}


//    private Show(ShowBuilder showBuilder)
//    {
//        this.id = showBuilder.id;
//        this.showType = showBuilder.showType;
//        this.title = showBuilder.title;
//        this.yearOfRelease = showBuilder.yearOfRelease;
//        this.duration = showBuilder.duration;
//        this.certification = showBuilder.certification;
//        this.imagesLink = showBuilder.imagesLink;
//        this.language = showBuilder.language;
//        this.synopsis = showBuilder.synopsis;
//        this.leadActors = showBuilder.leadActors;
//        this.director = showBuilder.director;
//        this.genre = showBuilder.genre;
//        this.trailerLink = showBuilder.trailerLink;
//        this.print = showBuilder.print;
//        this.matchPercentage = showBuilder.matchPercentage;
//        this.imdbRating = showBuilder.imdbRating;
//        this.rottenTomatoesRating = showBuilder.rottenTomatoesRating;
//        this.awards = showBuilder.awards;
//        this.subtitlesLink = showBuilder.subtitlesLink;
//        this.noOfSeasons = showBuilder.noOfSeasons;
//        this.serviceTypeListMap = showBuilder.serviceTypeListMap;
//    }

//    public static class ShowBuilder{
//
//        //Mandatory
//        @Id
//        private String id;
//        private ShowType showType;
//        private String title;
//        private String yearOfRelease;
//        private String duration;
//        private String certification;
//        private String imagesLink;
//        private String language;
//        private String synopsis;
//        private String[] leadActors;
//        private String director;
//        private String genre;
//
//        //Optional
//        private String trailerLink;
//        private String print;
//        private Integer matchPercentage;
//        private String imdbRating;
//        private String rottenTomatoesRating;
//        private String[] awards;
//        private String subtitlesLink;
//        private int noOfSeasons;
//        private Map<ServiceType, List<Provider>> serviceTypeListMap;
//
//        private ShowBuilder(){}
//        public ShowBuilder(String id, String title, ShowType showType){
//            this.id = id;
//            this.title = title;
//            this.showType = showType;
//        }
//        public Show build(){
//            return new Show(this);
//        }
//
//        public ShowBuilder setId(String id){
//            this.id = id;
//            return this;
//        }
//
//        public ShowBuilder setShowType(ShowType showType) {
//            this.showType = showType;
//            return this;
//        }
//
//        public ShowBuilder setTitle(String title) {
//            this.title = title;
//            return this;
//        }
//
//        public ShowBuilder setYearOfRelease(String yearOfRelease) {
//            this.yearOfRelease = yearOfRelease;
//            return this;
//        }
//
//        public ShowBuilder setDuration(String duration) {
//            this.duration = duration;
//            return this;
//        }
//
//        public ShowBuilder setCertification(String certification) {
//            this.certification = certification;
//            return this;
//        }
//
//        public ShowBuilder setImagesLink(String imagesLink) {
//            this.imagesLink = imagesLink;
//            return this;
//        }
//
//        public ShowBuilder setLanguage(String language) {
//            this.language = language;
//            return this;
//        }
//
//        public ShowBuilder setSynopsis(String synopsis) {
//            this.synopsis = synopsis;
//            return this;
//        }
//
//        public ShowBuilder setLeadActors(String[] leadActors) {
//            this.leadActors = leadActors;
//            return this;
//        }
//
//        public ShowBuilder setDirector(String director) {
//            this.director = director;
//            return this;
//        }
//
//        public ShowBuilder setGenre(String genre) {
//            this.genre = genre;
//            return this;
//        }
//
//        public ShowBuilder setTrailerLink(String trailerLink) {
//            this.trailerLink = trailerLink;
//            return this;
//        }
//
//        public ShowBuilder setPrint(String print) {
//            this.print = print;
//            return this;
//        }
//
//        public ShowBuilder setMatchPercentage(Integer matchPercentage) {
//            this.matchPercentage = matchPercentage;
//            return this;
//        }
//
//        public ShowBuilder setImdbRating(String imdbRating) {
//            this.imdbRating = imdbRating;
//            return this;
//        }
//
//        public ShowBuilder setRottenTomatoesRating(String rottenTomatoesRating) {
//            this.rottenTomatoesRating = rottenTomatoesRating;
//            return this;
//        }
//
//        public ShowBuilder setAwards(String[] awards) {
//            this.awards = awards;
//            return this;
//        }
//
//        public ShowBuilder setSubtitlesLink(String subtitlesLink) {
//            this.subtitlesLink = subtitlesLink;
//            return this;
//        }
//
//        public ShowBuilder setNoOfSeasons(int noOfSeasons) {
//            this.noOfSeasons = noOfSeasons;
//            return this;
//        }
//
//        public ShowBuilder setServiceTypeListMap(Map<ServiceType, List<Provider>> serviceTypeListMap) {
//            this.serviceTypeListMap = serviceTypeListMap;
//            return this;
//        }
//
//    }




}
