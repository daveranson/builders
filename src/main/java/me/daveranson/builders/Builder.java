/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.daveranson.builders;

/**
 * Interface for builders.
 *
 * @author dave ranson
 * @param <T> The type of product being built.
 */
public interface Builder<T> {

    /**
     * Builds the product under construction. If the object cannot be
     * constructed a {@link IllegalStateException} shall be thrown.
     *
     * @return  the constructed object.
     */
    public T build();

}
