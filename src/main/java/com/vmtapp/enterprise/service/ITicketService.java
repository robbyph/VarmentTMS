package com.vmtapp.enterprise.service;

import com.vmtapp.enterprise.dto.Ticket;


import java.util.List;
import java.util.ArrayList;

public interface ITicketService {

    /**
     * Checks user role by his/her email
     * @param email email of the user
     * @return status code : 0- user not found; 1- client; 2- technician
     */
    int checkUserRole(String email);

    /**
     * Retrieves all tickets that belong to the user with given email
     * @param email email
     * @return List<Ticket> list of tickets that belong to user
     */
    List<Ticket> fetchByEmail(String email);
  
      /**
    * fetch list of Tickets with given assignee
     * @param assignee
     * @return ArrayList<Ticket>
    * */
    ArrayList<Ticket> fetchTicketsByAssignee(String assignee);

    Ticket save(Ticket ticket);
}
