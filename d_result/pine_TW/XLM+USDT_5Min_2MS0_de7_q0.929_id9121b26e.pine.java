//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: XLMUSDT_5Min_2MS0_9121b26e Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XLMUSDT_5Min_2MS0_9121b26e", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XLMUSDT_5Min_9121b26e(Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum, smoothK_k, d_k, k, smoothD_d, rsi1, d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( rsi1 <= 45.7509 )
		if( d_k <= -1.84018 )
			if( d_k <= -8.2124 )
				if( Negative_Money_Flow <= 7570.59 )
					if( d_k <= -15.3616 )
						if( Negative_Money_Flow_Sum <= 245672 )
							if( Positive_Money_Flow <= 2367.18 )
								ret := 0.248434
							if( Positive_Money_Flow > 2367.18 )
								ret := -0.030303
						if( Negative_Money_Flow_Sum > 245672 )
							if( Negative_Money_Flow_Sum <= 3.23692e+06 )
								ret := 0.370915
							if( Negative_Money_Flow_Sum > 3.23692e+06 )
								ret := 1.000000 // buy
					if( d_k > -15.3616 )
						if( rsi1 <= 35.1022 )
							if( Money_Flow_Ratio <= 0.136999 )
								ret := 0.144509
							if( Money_Flow_Ratio > 0.136999 )
								ret := -0.272582
						if( rsi1 > 35.1022 )
							if( Money_Flow_Ratio <= 0.404321 )
								ret := 0.251867
							if( Money_Flow_Ratio > 0.404321 )
								ret := -0.046756
				if( Negative_Money_Flow > 7570.59 )
					if( rsi1 <= 36.3657 )
						if( MFI_Low <= 0.096992 )
							if( rsi1 <= 22.1105 )
								ret := -0.171171
							if( rsi1 > 22.1105 )
								ret := 0.531281
						if( MFI_Low > 0.096992 )
							if( Typical_Price <= 0.105242 )
								ret := -0.189655
							if( Typical_Price > 0.105242 )
								ret := 0.313253
					if( rsi1 > 36.3657 )
						if( Money_Flow_Ratio <= 0.401343 )
							if( Raw_Money_Flow <= 40807.1 )
								ret := 0.621451
							if( Raw_Money_Flow > 40807.1 )
								ret := 0.855709 // buy
						if( Money_Flow_Ratio > 0.401343 )
							if( Typical_Price <= 0.161801 )
								ret := 0.476684
							if( Typical_Price > 0.161801 )
								ret := -0.615385
			if( d_k > -8.2124 )
				if( Negative_Money_Flow <= 3012.64 )
					if( rsi1 <= 36.8112 )
						if( MFI_High <= -69.6254 )
							if( Negative_Money_Flow_Sum <= 263828 )
								ret := 0.270833
							if( Negative_Money_Flow_Sum > 263828 )
								ret := -0.400000
						if( MFI_High > -69.6254 )
							if( smoothK_k <= 93.3505 )
								ret := -0.406286
							if( smoothK_k > 93.3505 )
								ret := 0.444444
					if( rsi1 > 36.8112 )
						if( Money_Flow_Ratio <= 0.670703 )
							if( smoothD_d <= 14.5744 )
								ret := 0.133956
							if( smoothD_d > 14.5744 )
								ret := -0.050729
						if( Money_Flow_Ratio > 0.670703 )
							if( rsi1 <= 39.987 )
								ret := -0.364706
							if( rsi1 > 39.987 )
								ret := -0.188752
				if( Negative_Money_Flow > 3012.64 )
					if( Typical_Price <= 0.10557 )
						if( rsi1 <= 31.5952 )
							if( d <= 19.2657 )
								ret := -0.564322
							if( d > 19.2657 )
								ret := -0.106122
						if( rsi1 > 31.5952 )
							if( smoothK_k <= 19.189 )
								ret := -0.098546
							if( smoothK_k > 19.189 )
								ret := 0.332440
					if( Typical_Price > 0.10557 )
						if( rsi1 <= 26.4422 )
							if( smoothD_d <= 10.9481 )
								ret := -0.048193
							if( smoothD_d > 10.9481 )
								ret := -0.426667
						if( rsi1 > 26.4422 )
							if( Negative_Money_Flow <= 46263.4 )
								ret := 0.197586
							if( Negative_Money_Flow > 46263.4 )
								ret := 0.456734
		if( d_k > -1.84018 )
			if( rsi1 <= 33.3333 )
				if( Money_Flow_Ratio <= 0.230184 )
					if( Negative_Money_Flow_Sum <= 638592 )
						if( Raw_Money_Flow <= 463220 )
							if( d <= 0.004946 )
								ret := -0.271676
							if( d > 0.004946 )
								ret := -0.493333
						if( Raw_Money_Flow > 463220 )
							ret := 1.000000 // buy
					if( Negative_Money_Flow_Sum > 638592 )
						if( Negative_Money_Flow <= 482684 )
							if( Positive_Money_Flow_Sum <= 104696 )
								ret := -0.400000
							if( Positive_Money_Flow_Sum > 104696 )
								ret := -0.068132
						if( Negative_Money_Flow > 482684 )
							if( d_k <= 2.31243 )
								ret := -0.214286
							if( d_k > 2.31243 )
								ret := 0.800000 // buy
				if( Money_Flow_Ratio > 0.230184 )
					if( Money_Flow_Ratio <= 0.548281 )
						if( rsi1 <= 24.9947 )
							if( Typical_Price <= 0.138194 )
								ret := -0.692104
							if( Typical_Price > 0.138194 )
								ret := -0.313653
						if( rsi1 > 24.9947 )
							if( d_k <= 2.23256 )
								ret := -0.412526
							if( d_k > 2.23256 )
								ret := -0.627789
					if( Money_Flow_Ratio > 0.548281 )
						if( rsi1 <= 32.1433 )
							if( Typical_Price <= 0.152741 )
								ret := -0.694207
							if( Typical_Price > 0.152741 )
								ret := 0.092593
						if( rsi1 > 32.1433 )
							if( Typical_Price <= 0.137922 )
								ret := -0.905822 // sell
							if( Typical_Price > 0.137922 )
								ret := -0.295082
			if( rsi1 > 33.3333 )
				if( MFI_Low <= 24.3584 )
					if( Negative_Money_Flow <= 1683.51 )
						if( rsi1 <= 41.647 )
							if( MFI_Low <= 10.4593 )
								ret := -0.333096
							if( MFI_Low > 10.4593 )
								ret := -0.503142
						if( rsi1 > 41.647 )
							if( MFI <= 41.4101 )
								ret := -0.173090
							if( MFI > 41.4101 )
								ret := -0.451149
					if( Negative_Money_Flow > 1683.51 )
						if( MFI_High <= -50.6718 )
							if( smoothK_k <= 39.6428 )
								ret := -0.049430
							if( smoothK_k > 39.6428 )
								ret := 0.187500
						if( MFI_High > -50.6718 )
							if( Negative_Money_Flow_Sum <= 1.82074e+06 )
								ret := -0.222765
							if( Negative_Money_Flow_Sum > 1.82074e+06 )
								ret := 0.354545
				if( MFI_Low > 24.3584 )
					if( d <= 7.88134 )
						if( Raw_Money_Flow <= 223371 )
							if( d_k <= 0.001481 )
								ret := -0.218232
							if( d_k > 0.001481 )
								ret := -0.397621
						if( Raw_Money_Flow > 223371 )
							if( d <= 2.9259 )
								ret := -1.000000 // sell
							if( d > 2.9259 )
								ret := 0.857143 // buy
					if( d > 7.88134 )
						if( MFI_Low <= 33.4788 )
							if( rsi1 <= 41.6434 )
								ret := -0.552894
							if( rsi1 > 41.6434 )
								ret := -0.348708
						if( MFI_Low > 33.4788 )
							if( Positive_Money_Flow_Sum <= 96529.4 )
								ret := -0.514467
							if( Positive_Money_Flow_Sum > 96529.4 )
								ret := -0.683020
	if( rsi1 > 45.7509 )
		if( MFI <= 51.0711 )
			if( rsi1 <= 55.556 )
				if( MFI <= 38.4664 )
					if( Money_Flow_Ratio <= 0.433238 )
						if( smoothK_k <= 17.3423 )
							if( Raw_Money_Flow <= 38591.7 )
								ret := 0.022508
							if( Raw_Money_Flow > 38591.7 )
								ret := 0.545455
						if( smoothK_k > 17.3423 )
							if( d <= 84.9534 )
								ret := 0.561334
							if( d > 84.9534 )
								ret := 0.312227
					if( Money_Flow_Ratio > 0.433238 )
						if( d_k <= 1.96678 )
							if( Negative_Money_Flow <= 6011.96 )
								ret := 0.305433
							if( Negative_Money_Flow > 6011.96 )
								ret := 0.522501
						if( d_k > 1.96678 )
							if( Negative_Money_Flow_Sum <= 1.22657e+06 )
								ret := -0.012688
							if( Negative_Money_Flow_Sum > 1.22657e+06 )
								ret := 0.727273 // buy
				if( MFI > 38.4664 )
					if( Negative_Money_Flow <= 630.624 )
						if( smoothD_d <= 48.3944 )
							if( d_k <= -2.25347 )
								ret := 0.247335
							if( d_k > -2.25347 )
								ret := -0.201776
						if( smoothD_d > 48.3944 )
							if( smoothK_k <= 75.5445 )
								ret := -0.198396
							if( smoothK_k > 75.5445 )
								ret := 0.031453
					if( Negative_Money_Flow > 630.624 )
						if( smoothD_d <= 63.0435 )
							if( rsi1 <= 50.0773 )
								ret := 0.214702
							if( rsi1 > 50.0773 )
								ret := 0.434577
						if( smoothD_d > 63.0435 )
							if( k <= 69.7065 )
								ret := -0.132468
							if( k > 69.7065 )
								ret := 0.202020
			if( rsi1 > 55.556 )
				if( MFI_Low <= 13.9411 )
					if( smoothD_d <= 88.1805 )
						if( d_k <= 1.02192 )
							if( smoothK_k <= 96.9682 )
								ret := 0.730480 // buy
							if( smoothK_k > 96.9682 )
								ret := 0.484375
						if( d_k > 1.02192 )
							if( Positive_Money_Flow <= 6464.89 )
								ret := 0.396226
							if( Positive_Money_Flow > 6464.89 )
								ret := -0.130435
					if( smoothD_d > 88.1805 )
						if( rsi1 <= 60.0877 )
							if( MFI <= 28.2123 )
								ret := 0.516854
							if( MFI > 28.2123 )
								ret := 0.264901
						if( rsi1 > 60.0877 )
							if( smoothK_k <= 96.9795 )
								ret := 0.690691
							if( smoothK_k > 96.9795 )
								ret := 0.472973
				if( MFI_Low > 13.9411 )
					if( Negative_Money_Flow <= 9.07128 )
						if( smoothK_k <= 26.0889 )
							if( d_k <= -2.66131 )
								ret := 0.197368
							if( d_k > -2.66131 )
								ret := -0.169811
						if( smoothK_k > 26.0889 )
							if( d_k <= 2.21795 )
								ret := 0.478275
							if( d_k > 2.21795 )
								ret := 0.017664
					if( Negative_Money_Flow > 9.07128 )
						if( Typical_Price <= 0.137267 )
							if( d_k <= 1.52264 )
								ret := 0.647598
							if( d_k > 1.52264 )
								ret := 0.354633
						if( Typical_Price > 0.137267 )
							if( d_k <= -4.8095 )
								ret := 0.733333 // buy
							if( d_k > -4.8095 )
								ret := -0.017143
		if( MFI > 51.0711 )
			if( d_k <= 2.6592 )
				if( d_k <= -1.79614 )
					if( rsi1 <= 57.1959 )
						if( Negative_Money_Flow <= 27.052 )
							if( Raw_Money_Flow <= 119735 )
								ret := 0.056679
							if( Raw_Money_Flow > 119735 )
								ret := -0.336683
						if( Negative_Money_Flow > 27.052 )
							if( rsi1 <= 50.006 )
								ret := 0.120290
							if( rsi1 > 50.006 )
								ret := 0.404255
					if( rsi1 > 57.1959 )
						if( Negative_Money_Flow <= 0.682386 )
							if( rsi1 <= 75.0073 )
								ret := 0.344605
							if( rsi1 > 75.0073 )
								ret := 0.616945
						if( Negative_Money_Flow > 0.682386 )
							if( Typical_Price <= 0.137892 )
								ret := 0.638991
							if( Typical_Price > 0.137892 )
								ret := 0.246154
				if( d_k > -1.79614 )
					if( rsi1 <= 65.0006 )
						if( Positive_Money_Flow <= 4353.81 )
							if( k <= 5.47757 )
								ret := -0.144608
							if( k > 5.47757 )
								ret := 0.164676
						if( Positive_Money_Flow > 4353.81 )
							if( rsi1 <= 55.0873 )
								ret := -0.361257
							if( rsi1 > 55.0873 )
								ret := -0.091487
					if( rsi1 > 65.0006 )
						if( Typical_Price <= 0.110721 )
							if( rsi1 <= 71.4411 )
								ret := 0.437928
							if( rsi1 > 71.4411 )
								ret := 0.656058
						if( Typical_Price > 0.110721 )
							if( Typical_Price <= 0.149719 )
								ret := 0.337475
							if( Typical_Price > 0.149719 )
								ret := -0.198502
			if( d_k > 2.6592 )
				if( rsi1 <= 59.9753 )
					if( Positive_Money_Flow <= 14.3292 )
						if( d_k <= 10.976 )
							if( MFI_Low <= 49.7622 )
								ret := -0.091191
							if( MFI_Low > 49.7622 )
								ret := -0.287120
						if( d_k > 10.976 )
							if( MFI <= 55.3529 )
								ret := -0.088933
							if( MFI > 55.3529 )
								ret := -0.379724
					if( Positive_Money_Flow > 14.3292 )
						if( rsi1 <= 49.9995 )
							if( Typical_Price <= 0.150663 )
								ret := -0.719013 // sell
							if( Typical_Price > 0.150663 )
								ret := 0.218750
						if( rsi1 > 49.9995 )
							if( Money_Flow_Ratio <= 2.7688 )
								ret := -0.386248
							if( Money_Flow_Ratio > 2.7688 )
								ret := -0.611005
				if( rsi1 > 59.9753 )
					if( Positive_Money_Flow <= 3279.77 )
						if( d_k <= 10.0755 )
							if( rsi1 <= 67.1412 )
								ret := 0.160882
							if( rsi1 > 67.1412 )
								ret := 0.349421
						if( d_k > 10.0755 )
							if( smoothD_d <= 57.7548 )
								ret := 0.162942
							if( smoothD_d > 57.7548 )
								ret := -0.124814
					if( Positive_Money_Flow > 3279.77 )
						if( Typical_Price <= 0.107616 )
							if( MFI <= 76.7959 )
								ret := 0.239760
							if( MFI > 76.7959 )
								ret := -0.097254
						if( Typical_Price > 0.107616 )
							if( Raw_Money_Flow <= 240299 )
								ret := -0.270044
							if( Raw_Money_Flow > 240299 )
								ret := -0.744479 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Money_Flow_Index 
//@version=5
//indicator title="Money Flow Index (MFI)", shorttitle="MFI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)

// Input parameters
length_MFI = input.int(14, minval=1, title="MFI Length")

// Calculate the Typical Price
Typical_Price = (high + low + close) / 3

// Calculate Raw Money Flow
Raw_Money_Flow = Typical_Price * volume

// Calculate Positive and Negative Money Flow
Positive_Money_Flow = Raw_Money_Flow * (Typical_Price > Typical_Price[1] ? 1 : 0)
Negative_Money_Flow = Raw_Money_Flow * (Typical_Price < Typical_Price[1] ? 1 : 0)

// Sum of Positive and Negative Money Flow over the given length
Positive_Money_Flow_Sum = ta.sma(Positive_Money_Flow, length_MFI) * length_MFI
Negative_Money_Flow_Sum = ta.sma(Negative_Money_Flow, length_MFI) * length_MFI

// Calculate Money Flow Ratio
Money_Flow_Ratio = Positive_Money_Flow_Sum / Negative_Money_Flow_Sum

// Calculate MFI
MFI = 100 - (100 / (1 + Money_Flow_Ratio))

// Calculate MFI high and low bands
MFI_High = MFI - 80
MFI_Low = MFI - 20

// Plot the MFI
plot(MFI, color=color.blue, title="MFI")

// Plot the MFI high and low bands
hline(80, "MFI High", color=color.red, linestyle=hline.style_dashed)
hline(20, "MFI Low", color=color.green, linestyle=hline.style_dashed)
plot(MFI_High, color=color.red, title="MFI High Band")
plot(MFI_Low, color=color.green, title="MFI Low Band")


//CODE associated with the technical indicator L_Stochastic_RSI 
//@version=5
//indicator title="Stochastic RSI", shorttitle="Stoch RSI", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
smoothK = input.int(3, "K", minval=1)
smoothD = input.int(3, "D", minval=1)
lengthRSI = input.int(14, "RSI Length", minval=1)
lengthStoch = input.int(14, "Stochastic Length", minval=1)
src = input(close, title="RSI Source")
rsi1 = ta.rsi(src, lengthRSI)
k = ta.sma(ta.stoch(rsi1, rsi1, rsi1, lengthStoch), smoothK)
d = ta.sma(k, smoothD)
plot(k, "K", color=#2962FF)
plot(d, "D", color=#FF6D00)

d_k = d - k
smoothD_d = d - smoothD
smoothK_k = k - smoothK

h0 = hline(80, "Upper Band", color=#787B86)
hline(50, "Middle Band", color=color.new(#787B86, 50))
h1 = hline(20, "Lower Band", color=#787B86)
fill(h0, h1, color=color.rgb(33, 150, 243, 90), title="Background")
// EXPLANATION OF THE STRATEGY
//The provided Pine Script implements a trading strategy that includes stop loss (SL) and multiple take profit (TP) levels,
//with an option to activate a trailing stop at the third TP level. Here's a detailed breakdown of its components and functionality:

//Variables Initialization:
var float stop = na
var float limit1 = na
var float limit2 = na

// Converts a percentage to points based on the average position price and the minimum tick size.
percent2points(percent) =>
    strategy.position_avg_price * percent / 100 / syminfo.mintick

// Stop Loss and Take Profit Inputs:
//Defines inputs for stop loss and three take profit levels in percentage terms.
sl = percent2points(input(2.92, title="stop loss %%"))
tp1 = percent2points(input(1.12, title="take profit 1 %%"))
tp2 = percent2points(input(2.31, title="take profit 2 %%"))
tp3 = percent2points(input(3.91, title="take profit 3 %%"))
activateTrailingOnThirdStep = input(false,title="activate trailing on third stage (tp3 is amount, tp2 is offset level)")
log.info("Stop Loss (sl):", sl," Take Profit 1 (tp1):", tp1, " Take Profit 2 (tp2):", tp2," Take Profit 3 (tp3):", tp3)

// Current Profit Calculation:
//Calculates the current profit in points based on the position size and price.
curProfitInPts() =>
    if strategy.position_size > 0
        (high - strategy.position_avg_price) / syminfo.mintick
    else if strategy.position_size < 0
        (strategy.position_avg_price - low) / syminfo.mintick
    else
        0
// Stop Loss and Profit Target Price Calculations:
//Determines the stop loss and profit target prices based on the position size and offset points.
calcStopLossPrice(OffsetPts) =>
    if strategy.position_size > 0
        strategy.position_avg_price - OffsetPts * syminfo.mintick
    else if strategy.position_size < 0
        strategy.position_avg_price + OffsetPts * syminfo.mintick
    else
        0
calcProfitTrgtPrice(OffsetPts) =>
    calcStopLossPrice(-OffsetPts)
// Current Stage Determination:
//Determines the current stage of the trade based on the profit points reached.
getCurrentStage() =>
    var stage = 0
    if strategy.position_size == 0
        stage := 0
    if stage == 0 and strategy.position_size != 0
        stage := 1
    else if stage == 1 and curProfitInPts() >= tp1
        stage := 2
    else if stage == 2 and curProfitInPts() >= tp2
        stage := 3
    stage
stopLevel = -1.
profitLevel = calcProfitTrgtPrice(tp3)

log.info("Stop Level:", stopLevel)
log.info("Profit Level:", profitLevel)
//This part of the strategy sets up exit conditions based on the current stage of the trade and uses the same exit ID "x" to modify the exit parameters dynamically.
//The exit parameters include stop loss, take profit, and comments for each stage.
// based on current stage set up exit
// note: we use same exit ids ("x") consciously, for MODIFY the exit's parameters
curStage = getCurrentStage()
float op_operation = decision_tree_0_XLMUSDT_5Min_9121b26e(Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum, smoothK_k, d_k, k, smoothD_d, rsi1, d)

log.info("Decision Tree Operation (op_operation):", op_operation)
if (op_operation <= 0)
    if curStage == 1
        stopLevel := calcStopLossPrice(sl)
        strategy.exit("x", loss = sl, profit = tp3, comment = "sl or tp3")
    else if curStage == 2
        stopLevel := calcStopLossPrice(0)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "breakeven or tp3")
    else if curStage == 3
        stopLevel := calcStopLossPrice(-tp1)
        strategy.exit("x", stop = stopLevel, profit = tp3, comment = "tp1 or tp3")
    else
        strategy.cancel("x")


//SIGNAL MANAGE    User Adjustments and Risk Management
// The user can adjust the threshold values for op_operation to control the level of risk they are willing to take:
// Lower op_operation Threshold for Buy Signal (e.g., 0.5 instead of 0.55):
//     Effect: Generates more buy signals, increasing the frequency of trades. This is suitable for a user willing to take more risks and potentially capture more trading opportunities.
// Higher op_operation Threshold for Buy Signal (e.g., 0.8 instead of 0.55):
//     Effect: Generates fewer buy signals, reducing the frequency of trades. This is suitable for a user seeking to take fewer risks and only enter trades under more favorable conditions.
// Lower op_operation Threshold for Signal Closure (e.g., -0.8 instead of -0.9):
//     Effect: Closes positions less frequently, allowing trades more room to recover from temporary unfavorable conditions. This increases risk but can capture larger gains if the market reverses favorably.
// Higher op_operation Threshold for Signal Closure (e.g., -0.95 instead of -0.9):
//     Effect: Closes positions more frequently, exiting trades quickly at the first sign of unfavorable conditions. This decreases risk but may result in missed opportunities for recovery.
//Signal BUY
FIXED_DOLLAR_AMOUNT  = 10000
positionSize = FIXED_DOLLAR_AMOUNT / close
log.info("Position Size (in dollars $",FIXED_DOLLAR_AMOUNT,"):", positionSize)

if (op_operation >= 0.55)
    stop := close * 0.965
    limit1 := close * 1.03
    limit2 := close * 1.02
    strategy.entry("x", strategy.long, qty=positionSize, stop=stop, comment="in")
//Signal SELL
if (op_operation <= -0.9)
    strategy.close("x", comment = "under Le1")

// Impact on the Dataset
//Stop Loss (SL): Limits the maximum loss by exiting the position if the price moves against the trade by a specified percentage.
//Take Profit (TP1, TP2, TP3): Defines profit-taking levels to secure gains at different stages.
//Trailing Stop: Optionally activates a trailing stop at the third TP level to lock in profits while allowing for further gains if the price continues to move favorably.
//Position Entry and Exit: The strategy's buy and sell signals determine when to enter and exit positions, influencing the dataset by marking the points of trade execution and closure.
//Current Stage Tracking: Monitors the trade's progress through predefined stages, adjusting stop and profit levels accordingly.
//This strategy is designed to manage risk and maximize profits through a structured approach, incorporating multiple exit levels and dynamic adjustments based on market conditions. The dataset will reflect these actions, showing entries, exits, stop loss activations, and profit-taking events, providing valuable information for backtesting and performance analysis.
//Random forest AI offers significant advantages in trading, including the ability to handle large data sets, reduce overfitting and provide more robust predictions through the aggregation of multiple decision trees.

// NOTE: While the Tuisku team stands behind the quality and effectiveness of this trading strategy,
// PLEASE be aware that there is NO GUARANTEE of specific results or profits. TRADING INVOLVES SIGNIFICANT RISK, and it is important to use this strategy with careful consideration of your financial situation and risk tolerance.
// For further information and support, please contact us at Tuisku.eu.


