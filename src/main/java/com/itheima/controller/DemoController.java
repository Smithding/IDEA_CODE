package com.itheima.controller;

import com.itheima.pojo.Items;
import com.itheima.pojo.OueryVo;
import com.itheima.service.ItemService;
import com.sun.tools.internal.ws.wsdl.document.http.HTTPUrlReplacement;
import org.omg.CORBA.portable.ValueOutputStream;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.HttpServletBean;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 *Action接收
 */
@Controller
public class DemoController {

    @Autowired
    private ItemService itemService;

    @RequestMapping("/demo")
    public ModelAndView showIndex(){
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("message","hello world");
        modelAndView.setViewName("demo");
        return modelAndView;
    }

    //遍历所有商品
    @RequestMapping("/itemList")
    public ModelAndView getItemlist(){
        List<Items> list = itemService.getItemlist();
        ModelAndView modelAndView = new ModelAndView();
        System.out.println(list.size());
        modelAndView.addObject("itemlist",list);
        modelAndView.setViewName("itemList");
        return modelAndView;
    }

    //根据id修改商品
    @RequestMapping("itemEdit")
    public String itemEdit(Integer id , Model model){

        Items itemById = itemService.getItemById(id);
        model.addAttribute("item",itemById);

        return "editItem";
    }

    //保存提交商品,需要解决乱码问题
    @RequestMapping("updateitem")
    public String updateItem(Items items){


        itemService.updateItem(items);
        return "index";
    }
    //都条件查询
    @RequestMapping("/queryitem")
    public String queryitem(OueryVo vo){
        System.out.println(vo.getItems().getId());
        System.out.println(vo.getItems().getName());
        return "index";
    }

}
