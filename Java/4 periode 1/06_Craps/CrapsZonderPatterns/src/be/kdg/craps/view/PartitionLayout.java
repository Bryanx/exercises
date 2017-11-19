package be.kdg.craps.view;

import java.awt.*;

/**
 * This class implements a layout-manager that stacks two
 * components above or next to each other retaining
 * a certain ratio between the size of these components.
 * If more than 2 components are present in the container, only the
 * first 2 are shown.
 */
public class PartitionLayout implements LayoutManager {
    public static final int HORIZONTAL = 0;
    public static final int VERTICAL = 1;

    /**
     * the percentage of the left or upper component.
     */
    private int ratio;

    /**
     * the way that the components are stacked (HORIZONTAL or VERTICAL)
     */
    private int layout;

    PartitionLayout(int ratio, int layout) {
        this.ratio = ratio;
        this.layout = layout;
    }

    public void addLayoutComponent(String name, Component comp) {
    }

    public void removeLayoutComponent(Component comp) {
    }

    public Dimension minimumLayoutSize(Container parent) {
        if (layout == HORIZONTAL) {
            return minimumHorizontalLayoutSize(parent);
        } else {
            return minimumVerticalLayoutSize(parent);
        }
    }

    private Dimension minimumVerticalLayoutSize(Container target) {
         Component[] components = target.getComponents();

        if (components.length == 0) {
            return new Dimension(5, 5);
        } else if (components.length == 1) {
            return components[0].getMinimumSize();
        } else {

            int topHeight = components[0].getMinimumSize().height;
            int bottomHeight = topHeight * 100 / ratio;
            if (bottomHeight < components[1].getMinimumSize().height) {
                bottomHeight = components[1].getMinimumSize().height;
                topHeight = bottomHeight * 100 / (100 - ratio);
            }

            int width = components[0].getMinimumSize().width;
            if (width < components[1].getMinimumSize().width) {
                width = components[1].getMinimumSize().width;
            }

            return new Dimension(width, topHeight + bottomHeight);
        }
    }

    private Dimension minimumHorizontalLayoutSize(Container target) {
        Component[] components = target.getComponents();

        if (components.length == 0) {
            return new Dimension(5, 5);
        } else if (components.length == 1) {
            return components[0].getMinimumSize();
        } else {
            int leftWidth = components[0].getMinimumSize().width;
            int rightWidth = leftWidth * 100 / ratio;
            if (rightWidth < components[1].getMinimumSize().width) {
                rightWidth = components[1].getMinimumSize().width;
                leftWidth = rightWidth * 100 / (100 - ratio);
            }

            int height = components[0].getMinimumSize().height;
            if (height < components[1].getMinimumSize().height) {
                height = components[1].getMinimumSize().height;
            }

            return new Dimension(leftWidth + rightWidth, height);
        }
    }

    public Dimension preferredLayoutSize(Container parent) {
        if (layout == HORIZONTAL) {
            return preferredHorizontalLayoutSize(parent);
        } else {
            return preferredVerticalLayoutSize(parent);
        }
    }

    private Dimension preferredVerticalLayoutSize(Container target) {
        Component[] components = target.getComponents();

        if (components.length == 0) {
            return new Dimension(5, 5);
        } else if (components.length == 1) {
            return components[0].getPreferredSize();
        } else {
            int topHeight = components[0].getPreferredSize().height;
            int bottomHeight = topHeight * 100 / ratio;
            if (bottomHeight < components[1].getPreferredSize().height) {
                bottomHeight = components[1].getPreferredSize().height;
                topHeight = bottomHeight * 100 / (100 - ratio);
            }

            int width = components[0].getPreferredSize().width;
            if (width < components[1].getPreferredSize().width) {
                width = components[1].getPreferredSize().width;
            }

            return new Dimension(width, topHeight + bottomHeight);
        }
    }

    private Dimension preferredHorizontalLayoutSize(Container target) {
        Component[] components = target.getComponents();

        if (components.length == 0) {
            return new Dimension(5, 5);
        } else if (components.length == 1) {
            return components[0].getPreferredSize();
        } else {
            int leftWidth = components[0].getPreferredSize().width;
            int rightWidth = leftWidth * 100 / ratio;
            if (rightWidth < components[1].getPreferredSize().width) {
                rightWidth = components[1].getPreferredSize().width;
                leftWidth = rightWidth * 100 / (100 - ratio);
            }

            int height = components[0].getPreferredSize().height;
            if (height < components[1].getPreferredSize().height) {
                height = components[1].getPreferredSize().height;
            }

            return new Dimension(leftWidth + rightWidth, height);
        }
    }

    public void layoutContainer(Container parent) {
        if (layout == HORIZONTAL) {
            layoutContainerHorizontal(parent);
        } else {
            layoutContainerVertical(parent);
        }
    }

    private void layoutContainerVertical(Container target) {
        Component[] components = target.getComponents();

        int width = target.getWidth();
        int height = target.getHeight();

        if (components.length == 0) {
            return;
        }

        if (components.length == 1) {
            components[0].setSize(width, height);
            components[0].setLocation(0, 0);
        } else {
            components[0].setSize(width, height * ratio / 100);
            components[0].setLocation(0, 0);
            components[1].setSize(width, height - (height * ratio / 100));
            components[1].setLocation(0, height * ratio / 100);
        }
    }

    private void layoutContainerHorizontal(Container target) {
        Component[] components = target.getComponents();

        int width = target.getWidth();
        int height = target.getHeight();

        if (components.length == 0) {
            return;
        }

        if (components.length == 1) {
            components[0].setSize(width, height);
            components[0].setLocation(0, 0);
        } else {
            components[0].setSize(width * ratio / 100, height);
            components[0].setLocation(0, 0);
            components[1].setSize(width - (width * ratio / 100), height);
            components[1].setLocation(width * ratio / 100, 0);
        }
    }
}
