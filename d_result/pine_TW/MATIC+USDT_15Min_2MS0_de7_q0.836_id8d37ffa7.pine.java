//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: MATICUSDT_15Min_2MS0_8d37ffa7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_MATICUSDT_15Min_2MS0_8d37ffa7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_MATICUSDT_15Min_8d37ffa7(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( k <= 52.18 )
		if( smoothD_d <= 15.4048 )
			if( MFI_Low <= 12.2058 )
				if( Negative_Money_Flow_Sum <= 3.62377e+07 )
					if( Typical_Price <= 0.752093 )
						if( rsi1 <= 24.9993 )
							if( Positive_Money_Flow_Sum <= 1.55523e+06 )
								ret := -0.615297
							if( Positive_Money_Flow_Sum > 1.55523e+06 )
								ret := -0.417785
						if( rsi1 > 24.9993 )
							if( Positive_Money_Flow_Sum <= 2.04655e+06 )
								ret := -0.332955
							if( Positive_Money_Flow_Sum > 2.04655e+06 )
								ret := -0.043841
					if( Typical_Price > 0.752093 )
						if( rsi1 <= 32.7927 )
							if( MFI_Low <= 6.34463 )
								ret := -0.168372
							if( MFI_Low > 6.34463 )
								ret := -0.353418
						if( rsi1 > 32.7927 )
							if( Positive_Money_Flow_Sum <= 6.78504e+06 )
								ret := -0.090376
							if( Positive_Money_Flow_Sum > 6.78504e+06 )
								ret := 0.560000
				if( Negative_Money_Flow_Sum > 3.62377e+07 )
					if( MFI <= 22.8191 )
						if( Positive_Money_Flow_Sum <= 5.76256e+06 )
							if( MFI_Low <= -17.7886 )
								ret := 0.500000
							if( MFI_Low > -17.7886 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 5.76256e+06 )
							if( Positive_Money_Flow_Sum <= 1.04246e+07 )
								ret := 0.166667
							if( Positive_Money_Flow_Sum > 1.04246e+07 )
								ret := 0.933333 // buy
					if( MFI > 22.8191 )
						if( Typical_Price <= 0.912358 )
							if( MFI <= 29.4735 )
								ret := 0.166667
							if( MFI > 29.4735 )
								ret := 1.000000 // buy
						if( Typical_Price > 0.912358 )
							if( Positive_Money_Flow <= 1.78287e+06 )
								ret := 0.100000
							if( Positive_Money_Flow > 1.78287e+06 )
								ret := -0.900000 // sell
			if( MFI_Low > 12.2058 )
				if( rsi1 <= 37.4986 )
					if( Money_Flow_Ratio <= 0.806181 )
						if( Raw_Money_Flow <= 4.47335e+06 )
							if( rsi1 <= 25.93 )
								ret := -0.719266 // sell
							if( rsi1 > 25.93 )
								ret := -0.394647
						if( Raw_Money_Flow > 4.47335e+06 )
							if( Negative_Money_Flow <= 5.72392e+06 )
								ret := 0.342857
							if( Negative_Money_Flow > 5.72392e+06 )
								ret := -0.727273 // sell
					if( Money_Flow_Ratio > 0.806181 )
						if( k <= 0.003423 )
							if( Raw_Money_Flow <= 290762 )
								ret := -0.392157
							if( Raw_Money_Flow > 290762 )
								ret := -0.571875
						if( k > 0.003423 )
							if( Raw_Money_Flow <= 65054.3 )
								ret := -0.226667
							if( Raw_Money_Flow > 65054.3 )
								ret := -0.711189 // sell
				if( rsi1 > 37.4986 )
					if( MFI_Low <= 38.9322 )
						if( Negative_Money_Flow_Sum <= 2.2192e+07 )
							if( rsi1 <= 53.4942 )
								ret := -0.215882
							if( rsi1 > 53.4942 )
								ret := 0.090468
						if( Negative_Money_Flow_Sum > 2.2192e+07 )
							if( rsi1 <= 41.6098 )
								ret := -0.056338
							if( rsi1 > 41.6098 )
								ret := 0.568750
					if( MFI_Low > 38.9322 )
						if( rsi1 <= 58.851 )
							if( Raw_Money_Flow <= 752262 )
								ret := -0.348569
							if( Raw_Money_Flow > 752262 )
								ret := -0.626606
						if( rsi1 > 58.851 )
							if( Positive_Money_Flow <= 207580 )
								ret := 0.221354
							if( Positive_Money_Flow > 207580 )
								ret := -0.203782
		if( smoothD_d > 15.4048 )
			if( rsi1 <= 60.638 )
				if( MFI <= 59.1656 )
					if( smoothK_k <= 33.007 )
						if( Raw_Money_Flow <= 1.09028e+06 )
							if( Positive_Money_Flow <= 219069 )
								ret := -0.200795
							if( Positive_Money_Flow > 219069 )
								ret := -0.312931
						if( Raw_Money_Flow > 1.09028e+06 )
							if( Negative_Money_Flow <= 1.41662e+06 )
								ret := -0.173172
							if( Negative_Money_Flow > 1.41662e+06 )
								ret := 0.056877
					if( smoothK_k > 33.007 )
						if( rsi1 <= 43.7555 )
							if( Negative_Money_Flow <= 654578 )
								ret := -0.224479
							if( Negative_Money_Flow > 654578 )
								ret := 0.095642
						if( rsi1 > 43.7555 )
							if( MFI_Low <= 20.0616 )
								ret := 0.398946
							if( MFI_Low > 20.0616 )
								ret := 0.003457
				if( MFI > 59.1656 )
					if( rsi1 <= 50.573 )
						if( Positive_Money_Flow_Sum <= 1.68075e+06 )
							if( Positive_Money_Flow_Sum <= 1.67081e+06 )
								ret := -0.337580
							if( Positive_Money_Flow_Sum > 1.67081e+06 )
								ret := 0.454545
						if( Positive_Money_Flow_Sum > 1.68075e+06 )
							if( MFI_High <= -15.6147 )
								ret := -0.518485
							if( MFI_High > -15.6147 )
								ret := -0.684796
					if( rsi1 > 50.573 )
						if( MFI_Low <= 52.2074 )
							if( Positive_Money_Flow_Sum <= 6.52153e+06 )
								ret := -0.094737
							if( Positive_Money_Flow_Sum > 6.52153e+06 )
								ret := -0.284746
						if( MFI_Low > 52.2074 )
							if( Positive_Money_Flow_Sum <= 3.57225e+06 )
								ret := -0.295238
							if( Positive_Money_Flow_Sum > 3.57225e+06 )
								ret := -0.580105
			if( rsi1 > 60.638 )
				if( Positive_Money_Flow <= 535437 )
					if( Money_Flow_Ratio <= 5.51549 )
						if( d_k <= 0.123232 )
							if( Negative_Money_Flow_Sum <= 2.95955e+06 )
								ret := 0.293194
							if( Negative_Money_Flow_Sum > 2.95955e+06 )
								ret := 0.672680
						if( d_k > 0.123232 )
							if( MFI <= 58.7996 )
								ret := 0.414141
							if( MFI > 58.7996 )
								ret := 0.206764
					if( Money_Flow_Ratio > 5.51549 )
						if( MFI <= 92.1869 )
							if( smoothD_d <= 64.0112 )
								ret := -0.151786
							if( smoothD_d > 64.0112 )
								ret := 0.714286 // buy
						if( MFI > 92.1869 )
							if( Raw_Money_Flow <= 304036 )
								ret := -0.125000
							if( Raw_Money_Flow > 304036 )
								ret := -1.000000 // sell
				if( Positive_Money_Flow > 535437 )
					if( MFI_Low <= 52.0639 )
						if( d_k <= 9.77557 )
							if( MFI_Low <= 40.9265 )
								ret := 0.245989
							if( MFI_Low > 40.9265 )
								ret := -0.079156
						if( d_k > 9.77557 )
							if( Negative_Money_Flow_Sum <= 1.47304e+07 )
								ret := 0.401515
							if( Negative_Money_Flow_Sum > 1.47304e+07 )
								ret := 0.864865 // buy
					if( MFI_Low > 52.0639 )
						if( rsi1 <= 67.902 )
							if( Positive_Money_Flow_Sum <= 6.98948e+07 )
								ret := -0.561772
							if( Positive_Money_Flow_Sum > 6.98948e+07 )
								ret := 0.700000 // buy
						if( rsi1 > 67.902 )
							if( MFI_High <= 8.33348 )
								ret := 0.137026
							if( MFI_High > 8.33348 )
								ret := -0.539216
	if( k > 52.18 )
		if( rsi1 <= 61.9051 )
			if( Money_Flow_Ratio <= 1.01295 )
				if( rsi1 <= 47.1057 )
					if( Money_Flow_Ratio <= 0.515449 )
						if( rsi1 <= 36.2193 )
							if( Raw_Money_Flow <= 1.56105e+06 )
								ret := -0.205900
							if( Raw_Money_Flow > 1.56105e+06 )
								ret := 0.224490
						if( rsi1 > 36.2193 )
							if( Negative_Money_Flow <= 653699 )
								ret := 0.183991
							if( Negative_Money_Flow > 653699 )
								ret := 0.527273
					if( Money_Flow_Ratio > 0.515449 )
						if( Negative_Money_Flow <= 68839.5 )
							if( Negative_Money_Flow_Sum <= 6.0342e+06 )
								ret := -0.256062
							if( Negative_Money_Flow_Sum > 6.0342e+06 )
								ret := -0.084715
						if( Negative_Money_Flow > 68839.5 )
							if( Negative_Money_Flow_Sum <= 1.43685e+07 )
								ret := 0.020191
							if( Negative_Money_Flow_Sum > 1.43685e+07 )
								ret := -0.314642
				if( rsi1 > 47.1057 )
					if( MFI_High <= -40.0371 )
						if( Raw_Money_Flow <= 401329 )
							if( Typical_Price <= 0.841872 )
								ret := 0.400348
							if( Typical_Price > 0.841872 )
								ret := 0.206413
						if( Raw_Money_Flow > 401329 )
							if( Negative_Money_Flow_Sum <= 2.78688e+07 )
								ret := 0.626112
							if( Negative_Money_Flow_Sum > 2.78688e+07 )
								ret := 0.095652
					if( MFI_High > -40.0371 )
						if( rsi1 <= 53.2791 )
							if( Positive_Money_Flow <= 2474.36 )
								ret := 0.221852
							if( Positive_Money_Flow > 2474.36 )
								ret := 0.007252
						if( rsi1 > 53.2791 )
							if( Positive_Money_Flow_Sum <= 1.14699e+07 )
								ret := 0.392934
							if( Positive_Money_Flow_Sum > 1.14699e+07 )
								ret := -0.060914
			if( Money_Flow_Ratio > 1.01295 )
				if( rsi1 <= 54.5726 )
					if( k <= 67.956 )
						if( Negative_Money_Flow <= 1.30619e+06 )
							if( Raw_Money_Flow <= 1.10573e+06 )
								ret := -0.203471
							if( Raw_Money_Flow > 1.10573e+06 )
								ret := -0.554745
						if( Negative_Money_Flow > 1.30619e+06 )
							if( Negative_Money_Flow_Sum <= 6.53049e+06 )
								ret := -0.413793
							if( Negative_Money_Flow_Sum > 6.53049e+06 )
								ret := 0.301587
					if( k > 67.956 )
						if( d <= 98.5923 )
							if( Negative_Money_Flow <= 634043 )
								ret := -0.066841
							if( Negative_Money_Flow > 634043 )
								ret := 0.148014
						if( d > 98.5923 )
							if( Money_Flow_Ratio <= 1.64966 )
								ret := -0.434783
							if( Money_Flow_Ratio > 1.64966 )
								ret := -1.000000 // sell
				if( rsi1 > 54.5726 )
					if( Money_Flow_Ratio <= 1.61486 )
						if( Positive_Money_Flow_Sum <= 1.34909e+07 )
							if( MFI_High <= -20.3772 )
								ret := 0.214311
							if( MFI_High > -20.3772 )
								ret := 0.044369
						if( Positive_Money_Flow_Sum > 1.34909e+07 )
							if( MFI <= 58.6847 )
								ret := -0.275410
							if( MFI > 58.6847 )
								ret := 0.290323
					if( Money_Flow_Ratio > 1.61486 )
						if( Positive_Money_Flow <= 359851 )
							if( Negative_Money_Flow <= 1.02846e+06 )
								ret := 0.062454
							if( Negative_Money_Flow > 1.02846e+06 )
								ret := -0.258303
						if( Positive_Money_Flow > 359851 )
							if( d <= 84.8699 )
								ret := -0.281424
							if( d > 84.8699 )
								ret := 0.052209
		if( rsi1 > 61.9051 )
			if( Money_Flow_Ratio <= 1.38272 )
				if( rsi1 <= 69.0219 )
					if( MFI_High <= -28.1571 )
						if( Positive_Money_Flow_Sum <= 2.12615e+06 )
							if( Raw_Money_Flow <= 284037 )
								ret := 0.481915
							if( Raw_Money_Flow > 284037 )
								ret := 0.717949 // buy
						if( Positive_Money_Flow_Sum > 2.12615e+06 )
							if( Typical_Price <= 1.07223 )
								ret := 0.687154
							if( Typical_Price > 1.07223 )
								ret := 0.516667
					if( MFI_High > -28.1571 )
						if( Positive_Money_Flow_Sum <= 2.1828e+07 )
							if( Typical_Price <= 0.861228 )
								ret := 0.471607
							if( Typical_Price > 0.861228 )
								ret := 0.283019
						if( Positive_Money_Flow_Sum > 2.1828e+07 )
							if( Positive_Money_Flow_Sum <= 3.24693e+07 )
								ret := -0.259259
							if( Positive_Money_Flow_Sum > 3.24693e+07 )
								ret := -1.000000 // sell
				if( rsi1 > 69.0219 )
					if( Negative_Money_Flow_Sum <= 959418 )
						if( Typical_Price <= 0.470311 )
							if( smoothK_k <= 93.2191 )
								ret := 0.968750 // buy
							if( smoothK_k > 93.2191 )
								ret := 0.000000
						if( Typical_Price > 0.470311 )
							if( rsi1 <= 74.1856 )
								ret := 0.130435
							if( rsi1 > 74.1856 )
								ret := 0.486486
					if( Negative_Money_Flow_Sum > 959418 )
						if( k <= 99.9995 )
							if( Raw_Money_Flow <= 197532 )
								ret := 0.652452
							if( Raw_Money_Flow > 197532 )
								ret := 0.772222 // buy
						if( k > 99.9995 )
							if( Raw_Money_Flow <= 229883 )
								ret := 0.472222
							if( Raw_Money_Flow > 229883 )
								ret := 0.691131
			if( Money_Flow_Ratio > 1.38272 )
				if( Typical_Price <= 1.07506 )
					if( MFI_Low <= 52.5329 )
						if( Negative_Money_Flow <= 151182 )
							if( d <= 83.9051 )
								ret := 0.273150
							if( d > 83.9051 )
								ret := 0.428518
						if( Negative_Money_Flow > 151182 )
							if( rsi1 <= 70.5331 )
								ret := 0.419054
							if( rsi1 > 70.5331 )
								ret := 0.661475
					if( MFI_Low > 52.5329 )
						if( k <= 70.462 )
							if( rsi1 <= 67.4665 )
								ret := -0.189815
							if( rsi1 > 67.4665 )
								ret := 0.141201
						if( k > 70.462 )
							if( Raw_Money_Flow <= 5.28171e+06 )
								ret := 0.317544
							if( Raw_Money_Flow > 5.28171e+06 )
								ret := -0.231183
				if( Typical_Price > 1.07506 )
					if( Negative_Money_Flow_Sum <= 7.90873e+06 )
						if( rsi1 <= 75.5122 )
							if( MFI_Low <= 41.399 )
								ret := 0.327434
							if( MFI_Low > 41.399 )
								ret := -0.044622
						if( rsi1 > 75.5122 )
							if( Typical_Price <= 1.22509 )
								ret := 0.383978
							if( Typical_Price > 1.22509 )
								ret := -0.090226
					if( Negative_Money_Flow_Sum > 7.90873e+06 )
						if( Negative_Money_Flow <= 730738 )
							if( MFI_High <= -7.94811 )
								ret := -0.504425
							if( MFI_High > -7.94811 )
								ret := -0.020202
						if( Negative_Money_Flow > 730738 )
							if( Negative_Money_Flow_Sum <= 2.9876e+07 )
								ret := 0.151961
							if( Negative_Money_Flow_Sum > 2.9876e+07 )
								ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
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
float op_operation = decision_tree_0_MATICUSDT_15Min_8d37ffa7(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


