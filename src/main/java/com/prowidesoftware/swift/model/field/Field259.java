/*******************************************************************************
 * Copyright (c) 2016 Prowide Inc.
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Lesser General Public License as 
 *     published by the Free Software Foundation, either version 3 of the 
 *     License, or (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  
 *     
 *     Check the LGPL at <http://www.gnu.org/licenses/> for more details.
 *******************************************************************************/
 package com.prowidesoftware.swift.model.field;

import com.prowidesoftware.swift.model.Tag;
import com.prowidesoftware.Generated;
import com.prowidesoftware.deprecation.ProwideDeprecated;
import com.prowidesoftware.deprecation.TargetYear;

import java.io.Serializable;
import java.util.Locale;
import java.util.List;
import java.util.ArrayList;
import java.util.Calendar;
import com.prowidesoftware.swift.model.field.DateContainer;

import org.apache.commons.lang.StringUtils;

import com.prowidesoftware.swift.model.field.SwiftParseUtils;
import com.prowidesoftware.swift.model.field.Field;
import com.prowidesoftware.swift.model.*;
import com.prowidesoftware.swift.utils.SwiftFormatUtils;


/**
 * <h2>SWIFT MT Field 259</h2>
 * Model and parser for field 259 of a SWIFT MT message.
 *
 * <h4>Subfields (components) Data types</h4>
 * <ol> 
 * 		<li><code>LogicalTerminalAddress</code></li> 
 * 		<li><code>Number</code></li> 
 * 		<li><code>Number</code></li> 
 * 		<li><code>Calendar</code></li> 
 * 		<li><code>Calendar</code></li> 
 * 		<li><code>Calendar</code></li> 
 * </ol>
 *
 * <h4>Structure definition</h4>
 * <ul>
 * 		<li>validation pattern: <code>&lt;LT&gt;4!n1!n&lt;DATE2&gt;&lt;HHMM&gt;&lt;HHMM&gt;</code></li>
 * 		<li>parser pattern: <code>&lt;LT&gt;4!Nc&lt;DATE2&gt;&lt;HHMM&gt;&lt;HHMM&gt;</code></li>
 * 		<li>components pattern: <code>ZNNEHH</code></li>
 * </ul>
 *		 
 * <p>This class complies with standard release <strong>SRU2017</strong></p>
 * <p>NOTE: this source code has been generated from template</p>
 */
@SuppressWarnings("unused") 
@Generated
public class Field259 extends Field implements Serializable, DateContainer {
	/**
	 * Constant identifying the SRU to which this class belongs to.
	 */
	public static final int SRU = 2017;

	private static final long serialVersionUID = 1L;
	/**
	 * Constant with the field name 259
	 */
    public static final String NAME = "259";
    /**
     * same as NAME, intended to be clear when using static imports
     */
    public static final String F_259 = "259";
	public static final String PARSER_PATTERN ="<LT>4!Nc<DATE2><HHMM><HHMM>";
	public static final String COMPONENTS_PATTERN = "ZNNEHH";

	/**
	 * Component number for the LT Address subfield
	 */
	public static final Integer LT_ADDRESS = 1;

	/**
	 * Component number for the Session Number subfield
	 */
	public static final Integer SESSION_NUMBER = 2;

	/**
	 * Component number for the Message Category subfield
	 */
	public static final Integer MESSAGE_CATEGORY = 3;

	/**
	 * Component number for the Date subfield
	 */
	public static final Integer DATE = 4;

	/**
	 * Component number for the Start Time subfield
	 */
	public static final Integer START_TIME = 5;

	/**
	 * Component number for the End Time subfield
	 */
	public static final Integer END_TIME = 6;

	/**
	 * Default constructor. Creates a new field setting all components to null.
	 */
	public Field259() {
		super(6);
	}
	    					
	/**
	 * Creates a new field and initializes its components with content from the parameter value.
	 * @param value complete field value including separators and CRLF
	 */
	public Field259(final String value) {
		super(value);
	}
	
	/**
	 * Creates a new field and initializes its components with content from the parameter tag.
	 * The value is parsed with {@link #parse(String)} 	 
	 * @throws IllegalArgumentException if the parameter tag is null or its tagname does not match the field name
	 * @since 7.8
	 */
	public Field259(final Tag tag) {
		this();
		if (tag == null) {
			throw new IllegalArgumentException("tag cannot be null.");
		}
		if (!StringUtils.equals(tag.getName(), "259")) {
			throw new IllegalArgumentException("cannot create field 259 from tag "+tag.getName()+", tagname must match the name of the field.");
		}
		parse(tag.getValue());
	}
	
	/**
	 * Parses the parameter value into the internal components structure.
	 * <br />
	 * Used to update all components from a full new value, as an alternative
	 * to setting individual components. Previous component values are overwritten.
	 *
	 * @param value complete field value including separators and CRLF
	 * @since 7.8
	 */
	@Override
	public void parse(final String value) {
		init(6);
		if (value != null) {
			if (value.length() >= 12) {
				setComponent1(StringUtils.substring(value, 0, 12));
			}
        	if (value.length() >= 16) {
				setComponent2(StringUtils.substring(value, 12, 16));
			}
	        if (value.length() >= 17) {
				setComponent3(StringUtils.substring(value, 16, 17));
			}
	        if (value.length() >= 23) {
				setComponent4(StringUtils.substring(value, 17, 23));
			}
			if (value.length() >= 27) {
				setComponent5(StringUtils.substring(value, 23, 27));
			}
			if (value.length() > 27) {
				setComponent6(StringUtils.substring(value, 27));
			}
		}
	}
	
	/**
	 * Copy constructor.<br>
	 * Initializes the components list with a deep copy of the source components list.
	 * @param source a field instance to copy
	 * @since 7.7
	 */
	public static Field259 newInstance(Field259 source) {
		Field259 cp = new Field259();
		cp.setComponents(new ArrayList<String>(source.getComponents()));
		return cp;
	}
	
	/**
	 * Serializes the fields' components into the single string value (SWIFT format)
	 */
	@Override
	public String getValue() {
		final StringBuilder result = new StringBuilder();
		result.append(joinComponents());
		return result.toString();
	}

	/**
	* Create a Tag with this field name and the given value.
	* Shorthand for <code>new Tag(NAME, value)</code>
	* @see #NAME
	* @since 7.5
	*/
	public static Tag tag(final String value) {
		return new Tag(NAME, value);
	}

	/**
	* Create a Tag with this field name and an empty string as value
	* Shorthand for <code>new Tag(NAME, "")</code>
	* @see #NAME
	* @since 7.5
	*/
	public static Tag emptyTag() {
		return new Tag(NAME, "");
	}
	
	/**
	 * Get the component1
	 * @return the component1
	 */
	public String getComponent1() {
		return getComponent(1);
	}

	/**
	 * Get the component1 as LogicalTerminalAddress
	 * @return the component1 converted to LogicalTerminalAddress or <code>null</code> if cannot be converted
	 */
	public com.prowidesoftware.swift.model.LogicalTerminalAddress getComponent1AsLogicalTerminalAddress() {
		return SwiftFormatUtils.getLTAddress(getComponent(1));
	}

	/**
	 * Get the LT Address (component1).
	 * @return the LT Address from component1
	 */
	public String getLTAddress() {
		return getComponent(1);
	}
	
	/**
	 * Get the LT Address (component1) as LogicalTerminalAddress
	 * @return the LT Address from component1 converted to LogicalTerminalAddress or <code>null</code> if cannot be converted
	 */
	public com.prowidesoftware.swift.model.LogicalTerminalAddress getLTAddressAsLogicalTerminalAddress() {
		return SwiftFormatUtils.getLTAddress(getComponent(1));
	}

	/**
	 * Set the component1.
	 * @param component1 the component1 to set
	 */
	public Field259 setComponent1(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the component1 from a LogicalTerminalAddress object.
	 * @param component1 the LogicalTerminalAddress with the component1 content to set
	 */
	public Field259 setComponent1(com.prowidesoftware.swift.model.LogicalTerminalAddress component1) {
		setComponent(1, SwiftFormatUtils.getLTAddress(component1));
		return this;
	}
	
	/**
	 * Set the LT Address (component1).
	 * @param component1 the LT Address to set
	 */
	public Field259 setLTAddress(String component1) {
		setComponent(1, component1);
		return this;
	}
	
	/**
	 * Set the LT Address (component1) from a LogicalTerminalAddress object.
	 * @see #setComponent1(com.prowidesoftware.swift.model.LogicalTerminalAddress)
	 * @param component1 LogicalTerminalAddress with the LT Address content to set
	 */
	public Field259 setLTAddress(com.prowidesoftware.swift.model.LogicalTerminalAddress component1) {
		setComponent1(component1);
		return this;
	}
	/**
	 * Get the component2
	 * @return the component2
	 */
	public String getComponent2() {
		return getComponent(2);
	}

	/**
	 * Get the component2 as Number
	 * @return the component2 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent2AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(2));
	}

	/**
	 * Get the Session Number (component2).
	 * @return the Session Number from component2
	 */
	public String getSessionNumber() {
		return getComponent(2);
	}
	
	/**
	 * Get the Session Number (component2) as Number
	 * @return the Session Number from component2 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getSessionNumberAsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(2));
	}

	/**
	 * Set the component2.
	 * @param component2 the component2 to set
	 */
	public Field259 setComponent2(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the component2 from a Number object.
	 * <br />
	 * <em>If the component being set is a fixed length number, the argument will not be 
	 * padded.</em> It is recommended for these cases to use the setComponent2(String) 
	 * method.
	 * 
	 * @see #setComponent2(String)
	 *
	 * @param component2 the Number with the component2 content to set
	 */
	public Field259 setComponent2(java.lang.Number component2) {
		if (component2 != null) {
			setComponent(2, Integer.toString(component2.intValue()));
		}
		return this;
	}
	
	/**
	 * Set the Session Number (component2).
	 * @param component2 the Session Number to set
	 */
	public Field259 setSessionNumber(String component2) {
		setComponent(2, component2);
		return this;
	}
	
	/**
	 * Set the Session Number (component2) from a Number object.
	 * @see #setComponent2(java.lang.Number)
	 * @param component2 Number with the Session Number content to set
	 */
	public Field259 setSessionNumber(java.lang.Number component2) {
		setComponent2(component2);
		return this;
	}
	/**
	 * Get the component3
	 * @return the component3
	 */
	public String getComponent3() {
		return getComponent(3);
	}

	/**
	 * Get the component3 as Number
	 * @return the component3 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getComponent3AsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(3));
	}

	/**
	 * Get the Message Category (component3).
	 * @return the Message Category from component3
	 */
	public String getMessageCategory() {
		return getComponent(3);
	}
	
	/**
	 * Get the Message Category (component3) as Number
	 * @return the Message Category from component3 converted to Number or <code>null</code> if cannot be converted
	 */
	public java.lang.Number getMessageCategoryAsNumber() {
		return SwiftFormatUtils.getNumber(getComponent(3));
	}

	/**
	 * Set the component3.
	 * @param component3 the component3 to set
	 */
	public Field259 setComponent3(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the component3 from a Number object.
	 * <br />
	 * <em>If the component being set is a fixed length number, the argument will not be 
	 * padded.</em> It is recommended for these cases to use the setComponent3(String) 
	 * method.
	 * 
	 * @see #setComponent3(String)
	 *
	 * @param component3 the Number with the component3 content to set
	 */
	public Field259 setComponent3(java.lang.Number component3) {
		if (component3 != null) {
			setComponent(3, Integer.toString(component3.intValue()));
		}
		return this;
	}
	
	/**
	 * Set the Message Category (component3).
	 * @param component3 the Message Category to set
	 */
	public Field259 setMessageCategory(String component3) {
		setComponent(3, component3);
		return this;
	}
	
	/**
	 * Set the Message Category (component3) from a Number object.
	 * @see #setComponent3(java.lang.Number)
	 * @param component3 Number with the Message Category content to set
	 */
	public Field259 setMessageCategory(java.lang.Number component3) {
		setComponent3(component3);
		return this;
	}
	/**
	 * Get the component4
	 * @return the component4
	 */
	public String getComponent4() {
		return getComponent(4);
	}

	/**
	 * Get the component4 as Calendar
	 * @return the component4 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getComponent4AsCalendar() {
		return SwiftFormatUtils.getDate2(getComponent(4));
	}

	/**
	 * Get the Date (component4).
	 * @return the Date from component4
	 */
	public String getDate() {
		return getComponent(4);
	}
	
	/**
	 * Get the Date (component4) as Calendar
	 * @return the Date from component4 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getDateAsCalendar() {
		return SwiftFormatUtils.getDate2(getComponent(4));
	}

	/**
	 * Set the component4.
	 * @param component4 the component4 to set
	 */
	public Field259 setComponent4(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the component4 from a Calendar object.
	 * @param component4 the Calendar with the component4 content to set
	 */
	public Field259 setComponent4(java.util.Calendar component4) {
		setComponent(4, SwiftFormatUtils.getDate2(component4));
		return this;
	}
	
	/**
	 * Set the Date (component4).
	 * @param component4 the Date to set
	 */
	public Field259 setDate(String component4) {
		setComponent(4, component4);
		return this;
	}
	
	/**
	 * Set the Date (component4) from a Calendar object.
	 * @see #setComponent4(java.util.Calendar)
	 * @param component4 Calendar with the Date content to set
	 */
	public Field259 setDate(java.util.Calendar component4) {
		setComponent4(component4);
		return this;
	}
	/**
	 * Get the component5
	 * @return the component5
	 */
	public String getComponent5() {
		return getComponent(5);
	}

	/**
	 * Get the component5 as Calendar
	 * @return the component5 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getComponent5AsCalendar() {
		return SwiftFormatUtils.getTime3(getComponent(5));
	}

	/**
	 * Get the Start Time (component5).
	 * @return the Start Time from component5
	 */
	public String getStartTime() {
		return getComponent(5);
	}
	
	/**
	 * Get the Start Time (component5) as Calendar
	 * @return the Start Time from component5 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getStartTimeAsCalendar() {
		return SwiftFormatUtils.getTime3(getComponent(5));
	}

	/**
	 * Set the component5.
	 * @param component5 the component5 to set
	 */
	public Field259 setComponent5(String component5) {
		setComponent(5, component5);
		return this;
	}
	
	/**
	 * Set the component5 from a Calendar object.
	 * @param component5 the Calendar with the component5 content to set
	 */
	public Field259 setComponent5(java.util.Calendar component5) {
		setComponent(5, SwiftFormatUtils.getTime3(component5));
		return this;
	}
	
	/**
	 * Set the Start Time (component5).
	 * @param component5 the Start Time to set
	 */
	public Field259 setStartTime(String component5) {
		setComponent(5, component5);
		return this;
	}
	
	/**
	 * Set the Start Time (component5) from a Calendar object.
	 * @see #setComponent5(java.util.Calendar)
	 * @param component5 Calendar with the Start Time content to set
	 */
	public Field259 setStartTime(java.util.Calendar component5) {
		setComponent5(component5);
		return this;
	}
	/**
	 * Get the component6
	 * @return the component6
	 */
	public String getComponent6() {
		return getComponent(6);
	}

	/**
	 * Get the component6 as Calendar
	 * @return the component6 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getComponent6AsCalendar() {
		return SwiftFormatUtils.getTime3(getComponent(6));
	}

	/**
	 * Get the End Time (component6).
	 * @return the End Time from component6
	 */
	public String getEndTime() {
		return getComponent(6);
	}
	
	/**
	 * Get the End Time (component6) as Calendar
	 * @return the End Time from component6 converted to Calendar or <code>null</code> if cannot be converted
	 */
	public java.util.Calendar getEndTimeAsCalendar() {
		return SwiftFormatUtils.getTime3(getComponent(6));
	}

	/**
	 * Set the component6.
	 * @param component6 the component6 to set
	 */
	public Field259 setComponent6(String component6) {
		setComponent(6, component6);
		return this;
	}
	
	/**
	 * Set the component6 from a Calendar object.
	 * @param component6 the Calendar with the component6 content to set
	 */
	public Field259 setComponent6(java.util.Calendar component6) {
		setComponent(6, SwiftFormatUtils.getTime3(component6));
		return this;
	}
	
	/**
	 * Set the End Time (component6).
	 * @param component6 the End Time to set
	 */
	public Field259 setEndTime(String component6) {
		setComponent(6, component6);
		return this;
	}
	
	/**
	 * Set the End Time (component6) from a Calendar object.
	 * @see #setComponent6(java.util.Calendar)
	 * @param component6 Calendar with the End Time content to set
	 */
	public Field259 setEndTime(java.util.Calendar component6) {
		setComponent6(component6);
		return this;
	}
    
    public List<Calendar> dates() {
		List<Calendar> result = new ArrayList<Calendar>();
		result.add(SwiftFormatUtils.getDate2(getComponent(4)));
		result.add(SwiftFormatUtils.getTime3(getComponent(5)));
		result.add(SwiftFormatUtils.getTime3(getComponent(6)));
		return result;
	}

   /**
    * Given a component number it returns true if the component is optional,
    * regardless of the field being mandatory in a particular message.<br />
    * Being the field's value conformed by a composition of one or several 
    * internal component values, the field may be present in a message with
    * a proper value but with some of its internal components not set.
    *
    * @param component component number, first component of a field is referenced as 1
    * @return true if the component is optional for this field, false otherwise
    */
   @Override
   public boolean isOptional(int component) {   
       return false;
   }

   /**
    * Returns true if the field is a GENERIC FIELD as specified by the standard.
    *
    * @return true if the field is generic, false otherwise
    */
   @Override
   public boolean isGeneric() {   
       return false;
   }
   
   public String parserPattern() {
           return PARSER_PATTERN;
   }

	/**
	 * Returns the field's name composed by the field number and the letter option (if any)
	 * @return the static value of Field259.NAME
	 */
	@Override
	public String getName() {
		return NAME;
	}
	
	/**
	 * Returns the field's components pattern
	 * @return the static value of Field259.COMPONENTS_PATTERN
	 */
	@Override
	public final String componentsPattern() {
		return COMPONENTS_PATTERN;
	}

	/**
	 * Returns the field's validators pattern
	 */
	@Override
	public final String validatorPattern() {
		return "<LT>4!n1!n<DATE2><HHMM><HHMM>";
	}

	/**
	 * Get the first occurrence form the tag list or null if not found.
	 * @return null if not found o block is null or empty
	 * @param block may be null or empty 
	 */
	public static Field259 get(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return null;
		}
		final Tag t = block.getTagByName(NAME);
		if (t == null) {
			return null;
		}
		return new Field259(t) ;
	}
	
	/**
	 * Get the first instance of Field259 in the given message.
	 * @param msg may be empty or null
	 * @return null if not found or msg is empty or null
	 * @see #get(SwiftTagListBlock)
	 */
	public static Field259 get(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return null;
		return get(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field259 in the given message
	 * an empty list is returned if none found.
	 * @param msg may be empty or null in which case an empty list is returned
	 * @see #getAll(SwiftTagListBlock)
	 */ 
	public static List<Field259> getAll(final SwiftMessage msg) {
		if (msg == null || msg.getBlock4()==null || msg.getBlock4().isEmpty())
			return java.util.Collections.emptyList();
		return getAll(msg.getBlock4());
	}

	/**
	 * Get a list of all occurrences of the field Field259 from the given block
	 * an empty list is returned if none found.
	 *
	 * @param block may be empty or null in which case an empty list is returned 
	 */ 
	public static List<Field259> getAll(final SwiftTagListBlock block) {
		if (block == null || block.isEmpty()) {
			return java.util.Collections.emptyList();
		}
		final Tag[] arr = block.getTagsByName(NAME);
		if (arr != null && arr.length>0) {
			final ArrayList<Field259> result = new ArrayList<Field259>(arr.length);
			for (final Tag f : arr) {
				result.add( new Field259(f));
			}
			return result;
		}
		return java.util.Collections.emptyList();
	}
	
	/**
	 * Returns the defined amount of components.<br>
	 * This is not the amount of components present in the field instance, but the total amount of components 
	 * that this field accepts as defined. 
	 * @since 7.7
	 */
	@Override
	public int componentsSize() {
		return 6;
	}

	/**
	 * Returns a localized suitable for showing to humans string of a field component.<br>
	 *
	 * @param component number of the component to display
	 * @param locale optional locale to format date and amounts, if null, the default locale is used
	 * @return formatted component value or null if component number is invalid or not present
	 * @throws IllegalArgumentException if component number is invalid for the field
	 * @since 7.8
	 */
	@Override
	public String getValueDisplay(int component, Locale locale) {
		if (component < 1 || component > 6) {
			throw new IllegalArgumentException("invalid component number "+component+" for field 259");
		}
		if (component == 1) {
			//default format (as is)
			return getComponent(1);
		}
		if (component == 2) {
			//number or amount
			java.text.NumberFormat f = java.text.NumberFormat.getNumberInstance(notNull(locale));
    		Number n = getComponent2AsNumber();
			if (n != null) {
				return f.format(n);
			}
		}
		if (component == 3) {
			//number or amount
			java.text.NumberFormat f = java.text.NumberFormat.getNumberInstance(notNull(locale));
    		Number n = getComponent3AsNumber();
			if (n != null) {
				return f.format(n);
			}
		}
		if (component == 4) {
			//date
			java.text.DateFormat f = java.text.DateFormat.getDateInstance(java.text.DateFormat.DEFAULT, notNull(locale));
			java.util.Calendar cal = getComponent4AsCalendar();
			if (cal != null) {
				return f.format(cal.getTime());
			}
		}
		if (component == 5) {
			//time
			java.text.DateFormat f = new java.text.SimpleDateFormat("HH:mm", notNull(locale));
			java.util.Calendar cal = getComponent5AsCalendar();
			if (cal != null) {
				return f.format(cal.getTime());
			}
		}
		if (component == 6) {
			//time
			java.text.DateFormat f = new java.text.SimpleDateFormat("HH:mm", notNull(locale));
			java.util.Calendar cal = getComponent6AsCalendar();
			if (cal != null) {
				return f.format(cal.getTime());
			}
		}
		return null;	
	}
	
	/**
	 * Returns english label for components.
	 * <br />
	 * The index in the list is in sync with specific field component structure.
	 * @see #getComponentLabel(int)
	 * @since 7.8.4
	 */
	@Override
	protected List<String> getComponentLabels() {
		List<String> result = new ArrayList<String>();
		result.add("LT Address");
		result.add("Session Number");
		result.add("Message Category");
		result.add("Date");
		result.add("Start Time");
		result.add("End Time");
		return result;
	}
	

}
