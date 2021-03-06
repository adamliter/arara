/**
 * Rule converter, a tool for Arara
 * Copyright (c) 2018, Paulo Roberto Massa Cereda
 * All rights reserved.
 * 
 * Permission is hereby granted, free  of charge, to any person obtaining
 * a  copy  of this  software  and  associated documentation  files  (the
 * "Software"), to  deal in  the Software without  restriction, including
 * without limitation  the rights to  use, copy, modify,  merge, publish,
 * distribute, sublicense,  and/or sell  copies of  the Software,  and to
 * permit persons to whom the Software  is furnished to do so, subject to
 * the following conditions:
 * 
 * The  above  copyright  notice  and this  permission  notice  shall  be
 * included in all copies or substantial portions of the Software.
 * 
 * THE  SOFTWARE IS  PROVIDED  "AS  IS", WITHOUT  WARRANTY  OF ANY  KIND,
 * EXPRESS OR  IMPLIED, INCLUDING  BUT NOT LIMITED  TO THE  WARRANTIES OF
 * MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT  SHALL THE AUTHORS OR COPYRIGHT HOLDERS  BE LIABLE FOR ANY
 * CLAIM, DAMAGES OR  OTHER LIABILITY, WHETHER IN AN  ACTION OF CONTRACT,
 * TORT OR  OTHERWISE, ARISING  FROM, OUT  OF OR  IN CONNECTION  WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */
package com.github.cereda.arara.ruleconverter.model;

/**
 * Argument for the old rule format.
 * 
 * @author Paulo Roberto Massa Cereda
 * @version 1.0
 * @since 1.0
 */
public class OArgument {

    // the argument identifier
    private String identifier;
    
    // the argument flag
    private String flag;
    
    // the argument fallback
    private String fallback;

    /**
     * Constructor.
     */
    public OArgument() {
    }

    /**
     * Getter.
     * @return The identifier.
     */
    public String getIdentifier() {
        return identifier;
    }

    /**
     * Setter.
     * @param identifier The identifier.
     */
    public void setIdentifier(String identifier) {
        this.identifier = identifier;
    }

    /**
     * Getter.
     * @return The flag.
     */
    public String getFlag() {
        return flag;
    }

    /**
     * Setter.
     * @param flag The flag.
     */
    public void setFlag(String flag) {
        this.flag = flag;
    }
    
    /**
     * Getter.
     * @return The fallback. 
     */
    public String getDefault() {
        return fallback;
    }
    
    /**
     * Setter.
     * @param fallback The fallback.
     */
    public void setDefault(String fallback) {
        this.fallback = fallback;
    }

}
