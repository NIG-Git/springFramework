package sysblo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@Entity /*** 1 ***/
@Table(name="sample_table", schema="sampledao") /*** 2 ***/
@NamedQuery(name = "SampleEntity.getAllData", query = "SELECT u FROM SampleEntity u" ) /*** 3 ***/

public class SampleEntity {

	/*** 4 ***/
	@Id
	@Column(length=6, nullable=false)
	private String blog_name;

	@Column(length=3, nullable=false)
	private String user_name;

	public String getBlog_name() {
		return blog_name;
	}

	public void setBlog_name(String blog_name) {
		this.blog_name = blog_name;
	}

	public String getUser_name() {
		return user_name;
	}

	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

}
