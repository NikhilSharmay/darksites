package com.nightskies.darksites.entities;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import com.nightskies.darksites.models.Contribution;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
@EqualsAndHashCode
@Entity
@Table(name="contributions")
public class ContributionEntity extends Contribution {
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Long id;
	@ManyToOne
	@JoinColumn(name="user_id")
	private UserEntity userEntity;
    @OneToOne
	@JoinColumn(name = "darksite_id")
	private DarkSiteEntity darkSiteEntity;
    @CreationTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date created;
    @UpdateTimestamp
    @Temporal(TemporalType.TIMESTAMP)
    private Date updated;
    @Column(name = "horizon_visibility")
    private int horizonVisibility;
    private String description;
    @ElementCollection
    private List<String> photos;
    private boolean isHotelsAvailable;
    private boolean isCampingAllowed;
}
