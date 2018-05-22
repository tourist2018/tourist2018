package com.tourist.Test;

public class Thanhdev extends Test
{
        private float radius;

        public float AB()
        {
                return (3.14 * (radius / 2));
        }
}

public class Rectangle extends Figure
{
        private float length, width;

        public float getArea(Figure other)
        {
                return length * width;
        }
}

