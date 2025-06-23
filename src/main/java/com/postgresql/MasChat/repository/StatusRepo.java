package com.postgresql.MasChat.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;

import com.postgresql.MasChat.model.Status;

public interface StatusRepo extends JpaRepository<Status, UUID> {
    
}