/*
 * Role Model
 * 
 * Copyright (C) 2008-2010 University of Southern Queensland
 * Copyright (C) 2013 Queensland Cyber Infrastructure Foundation (http://www.qcif.edu.au/)
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along
 * with this program; if not, write to the Free Software Foundation, Inc.,
 * 51 Franklin Street, Fifth Floor, Boston, MA 02110-1301 USA.
 */
package com.googlecode.fascinator.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

import com.googlecode.fascinator.model.pk.RolePk;

/**
 * Entity for Role
 * 
 * @author Shilo Banihit
 *
 */
@Entity
@Table(name = "roles")
@IdClass(RolePk.class)
public class Role implements Serializable {
	
	private String recordId;
	private String role;
	
	public Role() {}
	
	public Role(String recordId, String role) {
		this.recordId = recordId;
		this.role = role;
	}
	
	@Id
	@Column
	public String getRecordId() {
		return recordId;
	}
	
	public void setRecordId(String recordId) {
		this.recordId = recordId;
	}
	
	@Id
	@Column
	public String getRole() {
		return role;
	}
	
	public void setRole(String role) {
		this.role = role;
	}
	
	public boolean equals(Object obj) {
		if (obj == this) return true;
		if (!(obj instanceof Role)) return false;
		Role inst = (Role) obj;
		return ( (inst.getRecordId() == null && getRecordId() == null) || (inst.getRecordId()!=null && inst.getRecordId().equalsIgnoreCase(recordId))
				&& ( (inst.getRole() == null && role == null) || (inst.getRole() != null && inst.getRole().equalsIgnoreCase(role)) )				
				);
	}
}
