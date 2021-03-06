package org.bedrockmc.api.gui;

import java.util.Collection;
import java.util.List;

public interface ModGuiScreen {

	/**
	 * Get all buttons on the gui screen
	 * @return all buttons
	 */
	public List<Button> getButtons();
	
	/**
	 * Add a button to the gui screem
	 * @param button
	 */
	public void addButton(Button button);
	
	/**
	 * Remove a button from the gui screen
	 * @param button
	 */
	public void removeButton(Button button);
	
	/**
	 * Get the current gui listener
	 * @return listener
	 */
	public GuiListener getGuiListener();
	
	/**
	 * Set the current gui listener
	 * @param listener
	 */
	public void setGuiListener(GuiListener listener);
	
	/**
	 * Close the curren gui. <b>If it is not open, the screen currently open will be closed</b>
	 */
	public void closeGui();
	
	/**
	 * Create a new button
	 * @param label
	 * @param x
	 * @param y
	 * @return button
	 */
	public Button createButton(int id,String label, int x, int y);
	
	/**
	 * Create a new button
	 * @param label
	 * @param x-Position
	 * @param y-Position
	 * @param width
	 * @param height
	 * @param enabled
	 * @return
	 */
	public Button createButton(int id,String label, int x, int y, int width, int height, boolean enabled);
	
	/**
	 * Create a new text field
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 * @return
	 */
	public TextField createTextField(int x, int y, int width, int height);
	
	/**
	 * Add a new label to the screen
	 * @param string
	 * @param x
	 * @param y
	 */
	public void addLabel(String string, int x, int y);
	
	/**
	 * Add an new element to the gui screen
	 * @param element
	 */
	public void addElement(Element element);
	
	/**
	 * Get all elements on the screen
	 * @return elements
	 */
	public Collection<Element> getElements();
	
	/**
	 * Remove an element from the screen
	 * @param element
	 */
	public void removeElement(Element element);
	
	/**
	 * Get the current type of the screen
	 * @return gui screen
	 */
	public GuiScreenType getType();
	
	/**
	 * Open the current screen
	 */
	public void openGui();
	
	public void drawString(int x, int y, String text);
	
	public void drawString(int x, int y, String text, int color);
	
	public void drawRectangle(int left, int top, int right, int bottom, int color);
	
	public void drawHorizontalLine(int left, int right, int y, int color);
	
	public void drawVerticalLine(int top, int bottom, int x, int color);
	
	
}
