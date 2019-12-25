 

## 设计模式

#### 七大原则(com.ys.principle)

1. 单一职责
2. 接口隔离
3. 依赖倒转
4. 里氏替换
5. 开闭(ocp)
6. 迪米特法则
7. 合成复用

| 设计原则名称                                        | 定 义       | 使用频率                                 | 代码位置 |
| :-------------------------------------------------- | ------------------------------------------------ | -------- |------|
| 单一职责原则 (Single Responsibility Principle, SRP) | 一个类只负责一个功能领域中的相应职责             | ★★★★☆    | com.ys.principle.singleresponsibility |
| 开闭原则 (Open-Closed Principle, OCP)               | 软件实体应对提供方扩展开放，而对使用方修改关闭。用抽象构建框架，用实现扩展细节。 | ★★★★★    | com.ys.principle.ocp.improve |
| 里氏代换原则 (Liskov Substitution Principle, LSP)   | 所有引用基类对象的地方能够透明地使用其子类的对象 | ★★★★★    | com.ys.principle.liskov.improve |
| 依赖倒转原则 (Dependence Inversion Principle, DIP)  | 抽象不应该依赖于细节，细节应该依赖于抽象(1.通过接口传递实现依赖 2.通过构造方法依赖传递 3.通过setter方法传递) | ★★★★★    | com.ys.principle.inversion.improve |
| 接口隔离原则 (Interface Segregation Principle, ISP) | 使用多个专门的接口，而不使用单一的总接口         | ★★☆☆☆    | com.ys.principle.segregation.improve |
| 合成复用原则 (Composite Reuse Principle, CRP)       | 尽量使用对象组合，而不是继承来达到复用的目的     | ★★★★☆    | |
| 迪米特法则 (Law of Demeter, LoD)                    | 一个软件实体应当尽可能少地与其他实体发生相互作用 | ★★★☆☆    | |

















