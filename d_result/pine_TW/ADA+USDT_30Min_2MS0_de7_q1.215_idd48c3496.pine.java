//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: ADAUSDT_30Min_2MS0_d48c3496 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_ADAUSDT_30Min_2MS0_d48c3496", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_ADAUSDT_30Min_d48c3496(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=7, max_features=0.65, min_samples_leaf=4,min_samples_split=5, random_state=843828734)
	if( rsi1 <= 47.4269 )
		if( d_k <= -4.80748 )
			if( Negative_Money_Flow_Sum <= 1.68865e+07 )
				if( Money_Flow_Ratio <= 0.706207 )
					if( rsi1 <= 35.2111 )
						if( Money_Flow_Ratio <= 0.320972 )
							if( Typical_Price <= 0.272516 )
								ret := 0.098361
							if( Typical_Price > 0.272516 )
								ret := -0.279302
						if( Money_Flow_Ratio > 0.320972 )
							if( Typical_Price <= 0.177018 )
								ret := 0.009901
							if( Typical_Price > 0.177018 )
								ret := -0.624398
					if( rsi1 > 35.2111 )
						if( Raw_Money_Flow <= 1.12421e+06 )
							if( Money_Flow_Ratio <= 0.231669 )
								ret := 0.327160
							if( Money_Flow_Ratio > 0.231669 )
								ret := -0.043317
						if( Raw_Money_Flow > 1.12421e+06 )
							if( Typical_Price <= 0.390552 )
								ret := 0.531835
							if( Typical_Price > 0.390552 )
								ret := 0.158416
				if( Money_Flow_Ratio > 0.706207 )
					if( rsi1 <= 39.9671 )
						if( Raw_Money_Flow <= 229609 )
							if( rsi1 <= 26.846 )
								ret := -1.000000 // sell
							if( rsi1 > 26.846 )
								ret := -0.142857
						if( Raw_Money_Flow > 229609 )
							if( Raw_Money_Flow <= 1.30571e+06 )
								ret := -0.709382 // sell
							if( Raw_Money_Flow > 1.30571e+06 )
								ret := -0.891892 // sell
					if( rsi1 > 39.9671 )
						if( Raw_Money_Flow <= 1.07772e+06 )
							if( MFI <= 55.9948 )
								ret := -0.110442
							if( MFI > 55.9948 )
								ret := -0.403409
						if( Raw_Money_Flow > 1.07772e+06 )
							if( MFI_Low <= 32.118 )
								ret := -0.368715
							if( MFI_Low > 32.118 )
								ret := -0.738636 // sell
			if( Negative_Money_Flow_Sum > 1.68865e+07 )
				if( d_k <= -8.74762 )
					if( rsi1 <= 27.5013 )
						if( MFI_High <= -72.811 )
							if( Typical_Price <= 0.792646 )
								ret := -0.100000
							if( Typical_Price > 0.792646 )
								ret := 0.750000 // buy
						if( MFI_High > -72.811 )
							if( Positive_Money_Flow_Sum <= 1.15028e+07 )
								ret := -0.726562 // sell
							if( Positive_Money_Flow_Sum > 1.15028e+07 )
								ret := -0.056180
					if( rsi1 > 27.5013 )
						if( Raw_Money_Flow <= 1.20725e+07 )
							if( MFI_Low <= 8.95508 )
								ret := 0.516750
							if( MFI_Low > 8.95508 )
								ret := 0.216258
						if( Raw_Money_Flow > 1.20725e+07 )
							if( Positive_Money_Flow <= 1.23471e+07 )
								ret := 0.833333 // buy
							if( Positive_Money_Flow > 1.23471e+07 )
								ret := 0.474227
				if( d_k > -8.74762 )
					if( rsi1 <= 33.9894 )
						if( rsi1 <= 26.9995 )
							if( MFI_Low <= -8.4263 )
								ret := 0.204082
							if( MFI_Low > -8.4263 )
								ret := -0.549488
						if( rsi1 > 26.9995 )
							if( MFI_High <= -54.325 )
								ret := 0.123404
							if( MFI_High > -54.325 )
								ret := -0.352490
					if( rsi1 > 33.9894 )
						if( Positive_Money_Flow <= 1.6604e+06 )
							if( rsi1 <= 40.2408 )
								ret := 0.199143
							if( rsi1 > 40.2408 )
								ret := 0.478976
						if( Positive_Money_Flow > 1.6604e+06 )
							if( Negative_Money_Flow_Sum <= 1.24234e+08 )
								ret := -0.110169
							if( Negative_Money_Flow_Sum > 1.24234e+08 )
								ret := 0.386364
		if( d_k > -4.80748 )
			if( Typical_Price <= 0.26596 )
				if( Negative_Money_Flow_Sum <= 6.77403e+06 )
					if( Positive_Money_Flow <= 186443 )
						if( rsi1 <= 29.7895 )
							if( Positive_Money_Flow_Sum <= 1.15666e+06 )
								ret := -0.177778
							if( Positive_Money_Flow_Sum > 1.15666e+06 )
								ret := -0.557325
						if( rsi1 > 29.7895 )
							if( Typical_Price <= 0.10173 )
								ret := 0.273128
							if( Typical_Price > 0.10173 )
								ret := -0.130682
					if( Positive_Money_Flow > 186443 )
						if( rsi1 <= 38.1302 )
							if( d_k <= -0.77131 )
								ret := -0.267442
							if( d_k > -0.77131 )
								ret := -0.649485
						if( rsi1 > 38.1302 )
							if( Money_Flow_Ratio <= 0.968984 )
								ret := -0.071429
							if( Money_Flow_Ratio > 0.968984 )
								ret := -0.532895
				if( Negative_Money_Flow_Sum > 6.77403e+06 )
					if( Positive_Money_Flow_Sum <= 4.332e+07 )
						if( Typical_Price <= 0.205022 )
							if( rsi1 <= 10.6997 )
								ret := -0.695652
							if( rsi1 > 10.6997 )
								ret := 0.253785
						if( Typical_Price > 0.205022 )
							if( Raw_Money_Flow <= 2.28539e+06 )
								ret := -0.207469
							if( Raw_Money_Flow > 2.28539e+06 )
								ret := 0.259843
					if( Positive_Money_Flow_Sum > 4.332e+07 )
						if( Negative_Money_Flow_Sum <= 7.33328e+07 )
							ret := -1.000000 // sell
						if( Negative_Money_Flow_Sum > 7.33328e+07 )
							ret := 0.000000
			if( Typical_Price > 0.26596 )
				if( rsi1 <= 37.5841 )
					if( Typical_Price <= 0.468952 )
						if( Raw_Money_Flow <= 3.50903e+06 )
							if( Money_Flow_Ratio <= 0.664401 )
								ret := -0.467609
							if( Money_Flow_Ratio > 0.664401 )
								ret := -0.647389
						if( Raw_Money_Flow > 3.50903e+06 )
							if( Negative_Money_Flow <= 5.99961e+06 )
								ret := -0.122563
							if( Negative_Money_Flow > 5.99961e+06 )
								ret := 0.483333
					if( Typical_Price > 0.468952 )
						if( Positive_Money_Flow_Sum <= 4.76777e+06 )
							if( d <= 28.9931 )
								ret := -0.557823
							if( d > 28.9931 )
								ret := -0.055556
						if( Positive_Money_Flow_Sum > 4.76777e+06 )
							if( d_k <= -0.500902 )
								ret := -0.538263
							if( d_k > -0.500902 )
								ret := -0.792324 // sell
				if( rsi1 > 37.5841 )
					if( MFI <= 44.2845 )
						if( Money_Flow_Ratio <= 0.34064 )
							if( Positive_Money_Flow <= 98561.8 )
								ret := 0.445783
							if( Positive_Money_Flow > 98561.8 )
								ret := 0.129252
						if( Money_Flow_Ratio > 0.34064 )
							if( rsi1 <= 42.6952 )
								ret := -0.255887
							if( rsi1 > 42.6952 )
								ret := -0.018702
					if( MFI > 44.2845 )
						if( Positive_Money_Flow_Sum <= 7.18703e+06 )
							if( Positive_Money_Flow_Sum <= 2.88456e+06 )
								ret := -0.129442
							if( Positive_Money_Flow_Sum > 2.88456e+06 )
								ret := -0.360082
						if( Positive_Money_Flow_Sum > 7.18703e+06 )
							if( d_k <= 6.57726 )
								ret := -0.449201
							if( d_k > 6.57726 )
								ret := -0.667955
	if( rsi1 > 47.4269 )
		if( d_k <= 5.10135 )
			if( rsi1 <= 61.7901 )
				if( Money_Flow_Ratio <= 0.851778 )
					if( Negative_Money_Flow_Sum <= 4.49743e+06 )
						if( Raw_Money_Flow <= 274198 )
							if( Typical_Price <= 0.086319 )
								ret := -1.000000 // sell
							if( Typical_Price > 0.086319 )
								ret := 0.042662
						if( Raw_Money_Flow > 274198 )
							if( rsi1 <= 54.848 )
								ret := 0.185185
							if( rsi1 > 54.848 )
								ret := 0.431907
					if( Negative_Money_Flow_Sum > 4.49743e+06 )
						if( Negative_Money_Flow <= 651597 )
							if( d <= 69.0659 )
								ret := 0.518535
							if( d > 69.0659 )
								ret := 0.348135
						if( Negative_Money_Flow > 651597 )
							if( d_k <= -6.83886 )
								ret := 0.751099 // buy
							if( d_k > -6.83886 )
								ret := 0.530337
				if( Money_Flow_Ratio > 0.851778 )
					if( Money_Flow_Ratio <= 1.72452 )
						if( rsi1 <= 53.9224 )
							if( Negative_Money_Flow <= 1.57927e+06 )
								ret := -0.061332
							if( Negative_Money_Flow > 1.57927e+06 )
								ret := 0.188157
						if( rsi1 > 53.9224 )
							if( Typical_Price <= 0.591615 )
								ret := 0.215043
							if( Typical_Price > 0.591615 )
								ret := 0.406814
					if( Money_Flow_Ratio > 1.72452 )
						if( Positive_Money_Flow <= 183596 )
							if( Negative_Money_Flow_Sum <= 5.40015e+07 )
								ret := -0.073980
							if( Negative_Money_Flow_Sum > 5.40015e+07 )
								ret := 0.486957
						if( Positive_Money_Flow > 183596 )
							if( MFI_Low <= 56.2261 )
								ret := -0.234266
							if( MFI_Low > 56.2261 )
								ret := -0.622449
			if( rsi1 > 61.7901 )
				if( Negative_Money_Flow_Sum <= 2.60211e+06 )
					if( rsi1 <= 77.6873 )
						if( Positive_Money_Flow <= 474700 )
							if( rsi1 <= 64.8161 )
								ret := 0.128947
							if( rsi1 > 64.8161 )
								ret := 0.334244
						if( Positive_Money_Flow > 474700 )
							if( smoothD_d <= 56.5152 )
								ret := -0.372263
							if( smoothD_d > 56.5152 )
								ret := 0.075388
					if( rsi1 > 77.6873 )
						if( rsi1 <= 88.7312 )
							if( Typical_Price <= 0.129332 )
								ret := -0.050000
							if( Typical_Price > 0.129332 )
								ret := 0.569832
						if( rsi1 > 88.7312 )
							if( MFI_High <= 13.3322 )
								ret := 0.871429 // buy
							if( MFI_High > 13.3322 )
								ret := 0.230769
				if( Negative_Money_Flow_Sum > 2.60211e+06 )
					if( Typical_Price <= 0.25296 )
						if( Raw_Money_Flow <= 928635 )
							if( k <= 80.2465 )
								ret := 0.673797
							if( k > 80.2465 )
								ret := 0.284553
						if( Raw_Money_Flow > 928635 )
							if( rsi1 <= 63.2321 )
								ret := 0.450980
							if( rsi1 > 63.2321 )
								ret := -0.114833
					if( Typical_Price > 0.25296 )
						if( d_k <= 0.865198 )
							if( rsi1 <= 73.502 )
								ret := 0.626745
							if( rsi1 > 73.502 )
								ret := 0.786690 // buy
						if( d_k > 0.865198 )
							if( rsi1 <= 75.7443 )
								ret := 0.384903
							if( rsi1 > 75.7443 )
								ret := 0.695560
		if( d_k > 5.10135 )
			if( Positive_Money_Flow <= 2.60786e+06 )
				if( rsi1 <= 59.7064 )
					if( MFI_High <= -27.992 )
						if( smoothK_k <= 15.0626 )
							if( Negative_Money_Flow <= 2.59455e+06 )
								ret := 0.375000
							if( Negative_Money_Flow > 2.59455e+06 )
								ret := 0.782051 // buy
						if( smoothK_k > 15.0626 )
							if( rsi1 <= 58.4927 )
								ret := 0.187500
							if( rsi1 > 58.4927 )
								ret := 0.710145 // buy
					if( MFI_High > -27.992 )
						if( Typical_Price <= 0.340017 )
							if( Negative_Money_Flow_Sum <= 1.79172e+07 )
								ret := -0.082962
							if( Negative_Money_Flow_Sum > 1.79172e+07 )
								ret := 0.539683
						if( Typical_Price > 0.340017 )
							if( Raw_Money_Flow <= 922420 )
								ret := -0.123722
							if( Raw_Money_Flow > 922420 )
								ret := -0.440818
				if( rsi1 > 59.7064 )
					if( Typical_Price <= 0.889509 )
						if( rsi1 <= 70.6925 )
							if( MFI <= 67.2791 )
								ret := 0.421270
							if( MFI > 67.2791 )
								ret := 0.124914
						if( rsi1 > 70.6925 )
							if( Negative_Money_Flow <= 2.01834e+07 )
								ret := 0.598563
							if( Negative_Money_Flow > 2.01834e+07 )
								ret := -1.000000 // sell
					if( Typical_Price > 0.889509 )
						if( d_k <= 8.36801 )
							if( d <= 34.5377 )
								ret := 0.785714 // buy
							if( d > 34.5377 )
								ret := 0.147321
						if( d_k > 8.36801 )
							if( rsi1 <= 73.1433 )
								ret := -0.245509
							if( rsi1 > 73.1433 )
								ret := 0.625000
			if( Positive_Money_Flow > 2.60786e+06 )
				if( rsi1 <= 62.1782 )
					if( Money_Flow_Ratio <= 1.6318 )
						if( Raw_Money_Flow <= 4.18975e+06 )
							if( rsi1 <= 53.0652 )
								ret := -0.300885
							if( rsi1 > 53.0652 )
								ret := 0.245098
						if( Raw_Money_Flow > 4.18975e+06 )
							if( Negative_Money_Flow_Sum <= 1.67192e+08 )
								ret := -0.543771
							if( Negative_Money_Flow_Sum > 1.67192e+08 )
								ret := -0.065574
					if( Money_Flow_Ratio > 1.6318 )
						if( Positive_Money_Flow <= 6.10347e+07 )
							if( smoothD_d <= 84.3057 )
								ret := -0.769373 // sell
							if( smoothD_d > 84.3057 )
								ret := -0.321839
						if( Positive_Money_Flow > 6.10347e+07 )
							if( MFI <= 69.3889 )
								ret := 0.714286 // buy
							if( MFI > 69.3889 )
								ret := -0.368421
				if( rsi1 > 62.1782 )
					if( Positive_Money_Flow <= 1.24513e+07 )
						if( MFI_High <= 1.92312 )
							if( rsi1 <= 65.8285 )
								ret := -0.051383
							if( rsi1 > 65.8285 )
								ret := 0.367788
						if( MFI_High > 1.92312 )
							if( rsi1 <= 75.2885 )
								ret := -0.699531
							if( rsi1 > 75.2885 )
								ret := 0.224138
					if( Positive_Money_Flow > 1.24513e+07 )
						if( rsi1 <= 75.8855 )
							if( Money_Flow_Ratio <= 3.68346 )
								ret := -0.323232
							if( Money_Flow_Ratio > 3.68346 )
								ret := -0.843284 // sell
						if( rsi1 > 75.8855 )
							if( Negative_Money_Flow_Sum <= 4.27484e+07 )
								ret := -0.454545
							if( Negative_Money_Flow_Sum > 4.27484e+07 )
								ret := 0.666667
	
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
float op_operation = decision_tree_0_ADAUSDT_30Min_d48c3496(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


