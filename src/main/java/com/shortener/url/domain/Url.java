package com.shortener.url.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "url")
public class Url{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @JsonIgnore
    private Long id;

    @Column(name = "long_url")
    private String longUrl;

    @Column(name = "url_hash")
    private String urlHash;

    @Column(name = "user_num")
    private Long userNum;

    @Column(name = "created_stp")
    private Date createdStp;

    @Column(name = "expiration_stp")
    private Date expirationStp;

}
