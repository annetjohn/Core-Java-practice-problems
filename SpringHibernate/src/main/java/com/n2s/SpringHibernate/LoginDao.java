package com.n2s.SpringHibernate;

import java.util.ArrayList;
import java.util.List;



import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

public class LoginDao {

	private HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	public void insertUser(LoginBean lb){
		template.save(lb);
	}
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	public void updateUser(LoginBean lb){
		template.update(lb);
	}
	
	@Transactional(readOnly = false, propagation = Propagation.REQUIRES_NEW)
	public void deleteUser(LoginBean lb){
		template.delete(lb);
	}
	
	public LoginBean getById(int id){
		LoginBean l = (LoginBean) template.get(LoginBean.class, id);
		return l;
	}
	
	public List<LoginBean> getAllUsers(){
		List<LoginBean> l = new ArrayList<LoginBean>();
		l = template.loadAll(LoginBean.class);
		return l;
	}
}
