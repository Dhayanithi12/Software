package org.web.model;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;
import javax.persistence.UniqueConstraint;

@Entity

@Table(name = "Brs_BusDetails", catalog = "bus", uniqueConstraints = {
		@UniqueConstraint(columnNames = "route_no", name = "Brs_route_no_unq") })

public class BusDetails {

}
