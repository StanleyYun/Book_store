package com.gsau.lisnter;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletRequest;
import javax.servlet.ServletRequestEvent;
import javax.servlet.ServletRequestListener;
import javax.servlet.http.HttpServletRequest;

import com.gsau.pojo.Book;

/**
 * Application Lifecycle Listener implementation class indexRequst
 *
 */
public class indexRequst implements ServletRequestListener {

    public void requestDestroyed(ServletRequestEvent sre)  { 
         // TODO Auto-generated method stub
	
    }
    public void requestInitialized(ServletRequestEvent sre)  { 
         // TODO Auto-generated method stub
	ServletRequest request=sre.getServletRequest();
	int pageSize=4;
	int rowCount=(Integer)sre.getServletContext().getAttribute("rowCount");
	int pageCount=rowCount% pageSize==0 ? rowCount/pageSize: rowCount/pageSize+1;
	int pageNow=1;
	//String spageNow=request.getParameter("pageNow");
	String spageNow=request.getParameter("pageNow");
	if(spageNow!=null){
	    pageNow=Integer.parseInt(spageNow);
	}
	int fromIndex=pageSize*(pageNow-1);
	int toIndex;
	if(pageNow==pageCount){
     toIndex=pageSize*(pageNow-1)+(rowCount-(pageSize*(pageNow-1)));
	}else{
	toIndex=pageSize*(pageNow-1)+pageSize;
	}
	ArrayList<Book> book=(ArrayList<Book>)sre.getServletContext().getAttribute("books");
		List<Book> books=book.subList(fromIndex, toIndex);
		request.setAttribute("pageNow", pageNow);
		request.setAttribute("pageCount", pageCount);
		request.setAttribute("books",books); 
    }
	
}
