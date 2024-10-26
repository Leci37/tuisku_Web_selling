//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: LINKUSDT_30Min_2MS0_6687cafb Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LINKUSDT_30Min_2MS0_6687cafb", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LINKUSDT_30Min_6687cafb(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.82,min_samples_leaf=7, min_samples_split=10,random_state=843828734)
	if( rsi1 <= 51.9311 )
		if( d_k <= -3.919 )
			if( Negative_Money_Flow <= 1.56648e+06 )
				if( rsi1 <= 43.5358 )
					if( MFI <= 38.1092 )
						if( rsi1 <= 33.0465 )
							if( d_k <= -7.84415 )
								ret := -0.066570
							if( d_k > -7.84415 )
								ret := -0.312757
						if( rsi1 > 33.0465 )
							if( Money_Flow_Ratio <= 0.361984 )
								ret := 0.267974
							if( Money_Flow_Ratio > 0.361984 )
								ret := 0.017675
					if( MFI > 38.1092 )
						if( Raw_Money_Flow <= 1.5634e+07 )
							if( rsi1 <= 36.0803 )
								ret := -0.502994
							if( rsi1 > 36.0803 )
								ret := -0.240147
						if( Raw_Money_Flow > 1.5634e+07 )
							if( Positive_Money_Flow <= 2.85632e+07 )
								ret := 0.714286 // buy
							if( Positive_Money_Flow > 2.85632e+07 )
								ret := 1.000000 // buy
				if( rsi1 > 43.5358 )
					if( Money_Flow_Ratio <= 0.973174 )
						if( Raw_Money_Flow <= 414150 )
							if( Positive_Money_Flow_Sum <= 3.57365e+06 )
								ret := 0.095023
							if( Positive_Money_Flow_Sum > 3.57365e+06 )
								ret := 0.360825
						if( Raw_Money_Flow > 414150 )
							if( MFI_High <= -46.4833 )
								ret := 0.531015
							if( MFI_High > -46.4833 )
								ret := 0.295943
					if( Money_Flow_Ratio > 0.973174 )
						if( MFI <= 69.7926 )
							if( rsi1 <= 45.2147 )
								ret := -0.323810
							if( rsi1 > 45.2147 )
								ret := -0.059553
						if( MFI > 69.7926 )
							if( Raw_Money_Flow <= 250793 )
								ret := 0.000000
							if( Raw_Money_Flow > 250793 )
								ret := -0.617021
			if( Negative_Money_Flow > 1.56648e+06 )
				if( k <= 25.0177 )
					if( rsi1 <= 33.8628 )
						if( Money_Flow_Ratio <= 0.376175 )
							if( rsi1 <= 17.2464 )
								ret := -0.787879 // sell
							if( rsi1 > 17.2464 )
								ret := 0.053872
						if( Money_Flow_Ratio > 0.376175 )
							if( Negative_Money_Flow_Sum <= 2.51179e+07 )
								ret := -0.613333
							if( Negative_Money_Flow_Sum > 2.51179e+07 )
								ret := -0.210526
					if( rsi1 > 33.8628 )
						if( Negative_Money_Flow <= 6.81767e+06 )
							if( Positive_Money_Flow_Sum <= 1.0383e+07 )
								ret := 0.409524
							if( Positive_Money_Flow_Sum > 1.0383e+07 )
								ret := -0.034130
						if( Negative_Money_Flow > 6.81767e+06 )
							if( MFI_Low <= 21.1622 )
								ret := 0.807692 // buy
							if( MFI_Low > 21.1622 )
								ret := 0.261905
				if( k > 25.0177 )
					if( Money_Flow_Ratio <= 0.700411 )
						if( rsi1 <= 40.6366 )
							if( MFI_Low <= 8.17109 )
								ret := 0.517344
							if( MFI_Low > 8.17109 )
								ret := 0.101093
						if( rsi1 > 40.6366 )
							if( Raw_Money_Flow <= 6.84264e+06 )
								ret := 0.654657
							if( Raw_Money_Flow > 6.84264e+06 )
								ret := 0.912863 // buy
					if( Money_Flow_Ratio > 0.700411 )
						if( rsi1 <= 46.8319 )
							if( Positive_Money_Flow_Sum <= 6.3939e+07 )
								ret := -0.191111
							if( Positive_Money_Flow_Sum > 6.3939e+07 )
								ret := 0.823529 // buy
						if( rsi1 > 46.8319 )
							if( Positive_Money_Flow_Sum <= 2.06376e+07 )
								ret := 0.593985
							if( Positive_Money_Flow_Sum > 2.06376e+07 )
								ret := 0.212766
		if( d_k > -3.919 )
			if( rsi1 <= 38.8014 )
				if( Money_Flow_Ratio <= 0.585048 )
					if( rsi1 <= 24.9671 )
						if( Negative_Money_Flow <= 3.43515e+06 )
							if( Typical_Price <= 6.94126 )
								ret := -0.487032
							if( Typical_Price > 6.94126 )
								ret := -0.672026
						if( Negative_Money_Flow > 3.43515e+06 )
							if( MFI <= 25.919 )
								ret := -0.329317
							if( MFI > 25.919 )
								ret := -0.672199
					if( rsi1 > 24.9671 )
						if( Typical_Price <= 24.6697 )
							if( Raw_Money_Flow <= 3.62003e+06 )
								ret := -0.308484
							if( Raw_Money_Flow > 3.62003e+06 )
								ret := 0.138167
						if( Typical_Price > 24.6697 )
							if( Positive_Money_Flow <= 1.85602e+06 )
								ret := -0.444008
							if( Positive_Money_Flow > 1.85602e+06 )
								ret := -0.827309 // sell
				if( Money_Flow_Ratio > 0.585048 )
					if( Typical_Price <= 7.84052 )
						if( Positive_Money_Flow_Sum <= 1.92214e+06 )
							if( rsi1 <= 23.2429 )
								ret := -0.469136
							if( rsi1 > 23.2429 )
								ret := -0.194915
						if( Positive_Money_Flow_Sum > 1.92214e+06 )
							if( d_k <= 8.03177 )
								ret := -0.408233
							if( d_k > 8.03177 )
								ret := -0.630667
					if( Typical_Price > 7.84052 )
						if( Money_Flow_Ratio <= 0.882943 )
							if( Typical_Price <= 20.0108 )
								ret := -0.475996
							if( Typical_Price > 20.0108 )
								ret := -0.693388
						if( Money_Flow_Ratio > 0.882943 )
							if( smoothK_k <= -2.96519 )
								ret := -0.519101
							if( smoothK_k > -2.96519 )
								ret := -0.718569 // sell
			if( rsi1 > 38.8014 )
				if( Money_Flow_Ratio <= 0.870699 )
					if( rsi1 <= 44.9538 )
						if( MFI_High <= -45.3896 )
							if( Positive_Money_Flow_Sum <= 6.35408e+07 )
								ret := 0.024438
							if( Positive_Money_Flow_Sum > 6.35408e+07 )
								ret := 1.000000 // buy
						if( MFI_High > -45.3896 )
							if( Positive_Money_Flow_Sum <= 2.55748e+07 )
								ret := -0.165718
							if( Positive_Money_Flow_Sum > 2.55748e+07 )
								ret := -0.486804
					if( rsi1 > 44.9538 )
						if( Positive_Money_Flow <= 3.99241e+06 )
							if( MFI <= 38.1473 )
								ret := 0.240637
							if( MFI > 38.1473 )
								ret := 0.047210
						if( Positive_Money_Flow > 3.99241e+06 )
							if( Negative_Money_Flow_Sum <= 1.84233e+08 )
								ret := -0.354839
							if( Negative_Money_Flow_Sum > 1.84233e+08 )
								ret := 1.000000 // buy
				if( Money_Flow_Ratio > 0.870699 )
					if( Positive_Money_Flow <= 541258 )
						if( d_k <= 7.64971 )
							if( rsi1 <= 45.2802 )
								ret := -0.324133
							if( rsi1 > 45.2802 )
								ret := -0.072680
						if( d_k > 7.64971 )
							if( Positive_Money_Flow_Sum <= 5.59906e+06 )
								ret := -0.197765
							if( Positive_Money_Flow_Sum > 5.59906e+06 )
								ret := -0.507353
					if( Positive_Money_Flow > 541258 )
						if( d_k <= 1.53869 )
							if( MFI_Low <= 45.3631 )
								ret := -0.230769
							if( MFI_Low > 45.3631 )
								ret := -0.610778
						if( d_k > 1.53869 )
							if( Positive_Money_Flow <= 2.51649e+06 )
								ret := -0.521531
							if( Positive_Money_Flow > 2.51649e+06 )
								ret := -0.732935 // sell
	if( rsi1 > 51.9311 )
		if( d_k <= 5.17413 )
			if( rsi1 <= 66.1861 )
				if( MFI_High <= -19.3043 )
					if( Negative_Money_Flow <= 371061 )
						if( d_k <= -1.10861 )
							if( Negative_Money_Flow_Sum <= 5.30928e+06 )
								ret := 0.254391
							if( Negative_Money_Flow_Sum > 5.30928e+06 )
								ret := 0.504631
						if( d_k > -1.10861 )
							if( Positive_Money_Flow <= 4.69961e+06 )
								ret := 0.241525
							if( Positive_Money_Flow > 4.69961e+06 )
								ret := -0.145729
					if( Negative_Money_Flow > 371061 )
						if( d_k <= -1.78363 )
							if( MFI <= 48.3069 )
								ret := 0.706727 // buy
							if( MFI > 48.3069 )
								ret := 0.553338
						if( d_k > -1.78363 )
							if( MFI_High <= -40.5289 )
								ret := 0.646667
							if( MFI_High > -40.5289 )
								ret := 0.374121
				if( MFI_High > -19.3043 )
					if( Negative_Money_Flow <= 284925 )
						if( rsi1 <= 59.9937 )
							if( Positive_Money_Flow <= 4.55323e+06 )
								ret := -0.068224
							if( Positive_Money_Flow > 4.55323e+06 )
								ret := -0.490909
						if( rsi1 > 59.9937 )
							if( MFI_High <= -16.1888 )
								ret := 0.302158
							if( MFI_High > -16.1888 )
								ret := 0.056452
					if( Negative_Money_Flow > 284925 )
						if( rsi1 <= 57.718 )
							if( MFI <= 65.65 )
								ret := 0.307018
							if( MFI > 65.65 )
								ret := -0.059361
						if( rsi1 > 57.718 )
							if( smoothD_d <= 65.9843 )
								ret := 0.461187
							if( smoothD_d > 65.9843 )
								ret := 0.226277
			if( rsi1 > 66.1861 )
				if( MFI <= 64.1755 )
					if( Negative_Money_Flow <= 682472 )
						if( rsi1 <= 73.3364 )
							if( d_k <= -1.4967 )
								ret := 0.620897
							if( d_k > -1.4967 )
								ret := 0.453069
						if( rsi1 > 73.3364 )
							if( Raw_Money_Flow <= 146211 )
								ret := 0.367089
							if( Raw_Money_Flow > 146211 )
								ret := 0.721604 // buy
					if( Negative_Money_Flow > 682472 )
						if( Positive_Money_Flow_Sum <= 1.30702e+08 )
							if( d <= 85.2725 )
								ret := 0.835646 // buy
							if( d > 85.2725 )
								ret := 0.726087 // buy
						if( Positive_Money_Flow_Sum > 1.30702e+08 )
							ret := -0.714286 // sell
				if( MFI > 64.1755 )
					if( rsi1 <= 75.197 )
						if( MFI <= 86.7193 )
							if( Typical_Price <= 24.197 )
								ret := 0.358306
							if( Typical_Price > 24.197 )
								ret := 0.601889
						if( MFI > 86.7193 )
							if( Raw_Money_Flow <= 4.66514e+06 )
								ret := -0.069767
							if( Raw_Money_Flow > 4.66514e+06 )
								ret := -0.800000 // sell
					if( rsi1 > 75.197 )
						if( Positive_Money_Flow_Sum <= 6.3001e+07 )
							if( MFI_Low <= 62.578 )
								ret := 0.687732
							if( MFI_Low > 62.578 )
								ret := 0.520661
						if( Positive_Money_Flow_Sum > 6.3001e+07 )
							if( Typical_Price <= 14.7463 )
								ret := -0.675676
							if( Typical_Price > 14.7463 )
								ret := 0.495968
		if( d_k > 5.17413 )
			if( rsi1 <= 69.1541 )
				if( Positive_Money_Flow <= 2.07143e+06 )
					if( MFI_High <= -11.9996 )
						if( MFI <= 50.2778 )
							if( Negative_Money_Flow_Sum <= 1.07564e+07 )
								ret := 0.224138
							if( Negative_Money_Flow_Sum > 1.07564e+07 )
								ret := 0.557692
						if( MFI > 50.2778 )
							if( rsi1 <= 58.3157 )
								ret := -0.085322
							if( rsi1 > 58.3157 )
								ret := 0.196124
					if( MFI_High > -11.9996 )
						if( rsi1 <= 61.303 )
							if( Positive_Money_Flow_Sum <= 5.7411e+06 )
								ret := -0.067227
							if( Positive_Money_Flow_Sum > 5.7411e+06 )
								ret := -0.334724
						if( rsi1 > 61.303 )
							if( Positive_Money_Flow_Sum <= 1.49566e+08 )
								ret := 0.011145
							if( Positive_Money_Flow_Sum > 1.49566e+08 )
								ret := -0.933333 // sell
				if( Positive_Money_Flow > 2.07143e+06 )
					if( Money_Flow_Ratio <= 2.35412 )
						if( rsi1 <= 59.7601 )
							if( MFI_High <= -28.94 )
								ret := 0.106061
							if( MFI_High > -28.94 )
								ret := -0.481953
						if( rsi1 > 59.7601 )
							if( Raw_Money_Flow <= 3.75759e+06 )
								ret := 0.275132
							if( Raw_Money_Flow > 3.75759e+06 )
								ret := -0.136126
					if( Money_Flow_Ratio > 2.35412 )
						if( smoothK_k <= 78.9668 )
							if( rsi1 <= 59.8869 )
								ret := -0.769634 // sell
							if( rsi1 > 59.8869 )
								ret := -0.532544
						if( smoothK_k > 78.9668 )
							if( smoothD_d <= 88.4471 )
								ret := 0.529412
							if( smoothD_d > 88.4471 )
								ret := 0.037037
			if( rsi1 > 69.1541 )
				if( MFI <= 79.1776 )
					if( rsi1 <= 73.1127 )
						if( Positive_Money_Flow <= 3.14676e+06 )
							if( d_k <= 8.19809 )
								ret := 0.293194
							if( d_k > 8.19809 )
								ret := 0.517375
						if( Positive_Money_Flow > 3.14676e+06 )
							if( Money_Flow_Ratio <= 2.29559 )
								ret := 0.464286
							if( Money_Flow_Ratio > 2.29559 )
								ret := -0.042254
					if( rsi1 > 73.1127 )
						if( Positive_Money_Flow <= 3.8374e+06 )
							if( d_k <= 17.6874 )
								ret := 0.669617
							if( d_k > 17.6874 )
								ret := 0.071429
						if( Positive_Money_Flow > 3.8374e+06 )
							if( d <= 67.6031 )
								ret := 0.923077 // buy
							if( d > 67.6031 )
								ret := 0.152174
				if( MFI > 79.1776 )
					if( rsi1 <= 75.4773 )
						if( Positive_Money_Flow <= 831434 )
							if( MFI_High <= 8.62422 )
								ret := 0.322368
							if( MFI_High > 8.62422 )
								ret := -0.150000
						if( Positive_Money_Flow > 831434 )
							if( Money_Flow_Ratio <= 5.12464 )
								ret := 0.042735
							if( Money_Flow_Ratio > 5.12464 )
								ret := -0.340782
					if( rsi1 > 75.4773 )
						if( MFI <= 93.1751 )
							if( rsi1 <= 84.0011 )
								ret := 0.370656
							if( rsi1 > 84.0011 )
								ret := 0.750000 // buy
						if( MFI > 93.1751 )
							if( Positive_Money_Flow_Sum <= 3.6286e+07 )
								ret := 0.161290
							if( Positive_Money_Flow_Sum > 3.6286e+07 )
								ret := -0.480000
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
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
float op_operation = decision_tree_0_LINKUSDT_30Min_6687cafb(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


