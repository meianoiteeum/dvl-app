package com.dvlcube.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.dvlcube.utils.BaseEntity;
import com.dvlcube.utils.interfaces.MxBean;
import com.dvlcube.utils.interfaces.Nameable;
import lombok.*;

/**
 * @since 3 de jun de 2019
 * @author Ulisses Lima
 */
@Getter
@Setter
@Builder
@Entity
@Table(name = "jobbean")
public class Job implements MxBean<Long>, Nameable, BaseEntity<Long> {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private Integer max;

}