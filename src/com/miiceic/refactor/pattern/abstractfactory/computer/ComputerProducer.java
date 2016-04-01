package com.miiceic.refactor.pattern.abstractfactory.computer;
public interface ComputerProducer
{
    Cpu createCpu();

    Ram createRam();
}