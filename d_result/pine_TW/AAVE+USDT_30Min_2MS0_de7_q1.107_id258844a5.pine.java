//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: AAVEUSDT_30Min_2MS0_258844a5 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAVEUSDT_30Min_2MS0_258844a5", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAVEUSDT_30Min_258844a5(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( rsi1 <= 53.1018 )
		if( smoothK_k <= 24.6741 )
			if( d_k <= 0.001586 )
				if( rsi1 <= 32.4025 )
					if( rsi1 <= 24.896 )
						if( Typical_Price <= 65.1659 )
							if( MFI <= 12.3439 )
								ret := 0.061538
							if( MFI > 12.3439 )
								ret := -0.403774
						if( Typical_Price > 65.1659 )
							if( d_k <= -5.12797 )
								ret := -0.426866
							if( d_k > -5.12797 )
								ret := -0.676779
					if( rsi1 > 24.896 )
						if( Money_Flow_Ratio <= 0.327388 )
							if( Negative_Money_Flow_Sum <= 1.82331e+07 )
								ret := -0.013093
							if( Negative_Money_Flow_Sum > 1.82331e+07 )
								ret := -0.456897
						if( Money_Flow_Ratio > 0.327388 )
							if( Money_Flow_Ratio <= 0.52121 )
								ret := -0.350487
							if( Money_Flow_Ratio > 0.52121 )
								ret := -0.552279
				if( rsi1 > 32.4025 )
					if( MFI_Low <= 28.2206 )
						if( Negative_Money_Flow <= 333202 )
							if( rsi1 <= 42.4138 )
								ret := -0.190415
							if( rsi1 > 42.4138 )
								ret := 0.061367
						if( Negative_Money_Flow > 333202 )
							if( rsi1 <= 39.4255 )
								ret := 0.043536
							if( rsi1 > 39.4255 )
								ret := 0.362406
					if( MFI_Low > 28.2206 )
						if( Typical_Price <= 87.6798 )
							if( Typical_Price <= 38.4354 )
								ret := 1.000000 // buy
							if( Typical_Price > 38.4354 )
								ret := -0.187730
						if( Typical_Price > 87.6798 )
							if( rsi1 <= 45.3782 )
								ret := -0.537994
							if( rsi1 > 45.3782 )
								ret := -0.134561
			if( d_k > 0.001586 )
				if( Typical_Price <= 104.722 )
					if( Typical_Price <= 67.5381 )
						if( rsi1 <= 37.2345 )
							if( Negative_Money_Flow_Sum <= 5.10393e+06 )
								ret := -0.417247
							if( Negative_Money_Flow_Sum > 5.10393e+06 )
								ret := 0.148936
						if( rsi1 > 37.2345 )
							if( Negative_Money_Flow_Sum <= 5.86781e+06 )
								ret := -0.157431
							if( Negative_Money_Flow_Sum > 5.86781e+06 )
								ret := 0.666667
					if( Typical_Price > 67.5381 )
						if( rsi1 <= 29.9994 )
							if( Negative_Money_Flow_Sum <= 4.58375e+06 )
								ret := -0.700467 // sell
							if( Negative_Money_Flow_Sum > 4.58375e+06 )
								ret := -0.374150
						if( rsi1 > 29.9994 )
							if( MFI_Low <= 15.8907 )
								ret := 0.010267
							if( MFI_Low > 15.8907 )
								ret := -0.453138
				if( Typical_Price > 104.722 )
					if( rsi1 <= 32.7918 )
						if( d_k <= 5.67855 )
							if( Raw_Money_Flow <= 5.77817e+06 )
								ret := -0.778998 // sell
							if( Raw_Money_Flow > 5.77817e+06 )
								ret := -0.365854
						if( d_k > 5.67855 )
							if( MFI_Low <= 10.3253 )
								ret := -0.717770 // sell
							if( MFI_Low > 10.3253 )
								ret := -0.893916 // sell
					if( rsi1 > 32.7918 )
						if( Money_Flow_Ratio <= 0.944554 )
							if( Raw_Money_Flow <= 1.57694e+06 )
								ret := -0.473207
							if( Raw_Money_Flow > 1.57694e+06 )
								ret := -0.184652
						if( Money_Flow_Ratio > 0.944554 )
							if( rsi1 <= 45.7649 )
								ret := -0.754576 // sell
							if( rsi1 > 45.7649 )
								ret := -0.536755
		if( smoothK_k > 24.6741 )
			if( d_k <= -2.19202 )
				if( Negative_Money_Flow <= 349782 )
					if( rsi1 <= 39.8061 )
						if( Money_Flow_Ratio <= 0.414723 )
							if( rsi1 <= 35.2109 )
								ret := -0.212544
							if( rsi1 > 35.2109 )
								ret := 0.131148
						if( Money_Flow_Ratio > 0.414723 )
							if( Negative_Money_Flow_Sum <= 842447 )
								ret := -0.549020
							if( Negative_Money_Flow_Sum > 842447 )
								ret := -0.303879
					if( rsi1 > 39.8061 )
						if( MFI_Low <= 21.952 )
							if( MFI <= 28.8441 )
								ret := 0.422222
							if( MFI > 28.8441 )
								ret := 0.187198
						if( MFI_Low > 21.952 )
							if( MFI_Low <= 30.1069 )
								ret := 0.053303
							if( MFI_Low > 30.1069 )
								ret := -0.181166
				if( Negative_Money_Flow > 349782 )
					if( MFI_Low <= 27.6193 )
						if( rsi1 <= 34.7748 )
							if( d_k <= -9.80588 )
								ret := 0.319079
							if( d_k > -9.80588 )
								ret := -0.154309
						if( rsi1 > 34.7748 )
							if( MFI_High <= -48.1597 )
								ret := 0.693970
							if( MFI_High > -48.1597 )
								ret := 0.504373
					if( MFI_Low > 27.6193 )
						if( Negative_Money_Flow_Sum <= 3.48677e+07 )
							if( rsi1 <= 48.0089 )
								ret := -0.103448
							if( rsi1 > 48.0089 )
								ret := 0.314159
						if( Negative_Money_Flow_Sum > 3.48677e+07 )
							ret := -1.000000 // sell
			if( d_k > -2.19202 )
				if( Positive_Money_Flow <= 187713 )
					if( rsi1 <= 42.6953 )
						if( MFI_High <= -43.509 )
							if( Negative_Money_Flow_Sum <= 3.23121e+07 )
								ret := -0.233580
							if( Negative_Money_Flow_Sum > 3.23121e+07 )
								ret := 0.423077
						if( MFI_High > -43.509 )
							if( d_k <= 3.74313 )
								ret := -0.403727
							if( d_k > 3.74313 )
								ret := -0.598907
					if( rsi1 > 42.6953 )
						if( MFI_High <= -28.8661 )
							if( Negative_Money_Flow <= 712586 )
								ret := 0.034060
							if( Negative_Money_Flow > 712586 )
								ret := 0.298532
						if( MFI_High > -28.8661 )
							if( rsi1 <= 46.8319 )
								ret := -0.486647
							if( rsi1 > 46.8319 )
								ret := -0.205769
				if( Positive_Money_Flow > 187713 )
					if( d_k <= 3.70305 )
						if( Positive_Money_Flow <= 1.22779e+06 )
							if( smoothD_d <= 79.0139 )
								ret := -0.346477
							if( smoothD_d > 79.0139 )
								ret := -0.108992
						if( Positive_Money_Flow > 1.22779e+06 )
							if( smoothD_d <= 94.6492 )
								ret := -0.650672
							if( smoothD_d > 94.6492 )
								ret := 0.387097
					if( d_k > 3.70305 )
						if( smoothD_d <= 79.3449 )
							if( rsi1 <= 37.9145 )
								ret := -0.821212 // sell
							if( rsi1 > 37.9145 )
								ret := -0.654990
						if( smoothD_d > 79.3449 )
							if( Positive_Money_Flow_Sum <= 4.09982e+06 )
								ret := -0.254717
							if( Positive_Money_Flow_Sum > 4.09982e+06 )
								ret := -0.562500
	if( rsi1 > 53.1018 )
		if( d_k <= 4.02296 )
			if( k <= 32.7365 )
				if( Negative_Money_Flow_Sum <= 5.31221e+06 )
					if( Positive_Money_Flow <= 257365 )
						if( rsi1 <= 57.4166 )
							if( MFI_High <= -7.7985 )
								ret := 0.076389
							if( MFI_High > -7.7985 )
								ret := -0.333333
						if( rsi1 > 57.4166 )
							if( Negative_Money_Flow <= 91592.2 )
								ret := 0.150820
							if( Negative_Money_Flow > 91592.2 )
								ret := 0.466513
					if( Positive_Money_Flow > 257365 )
						if( MFI <= 64.2393 )
							if( Positive_Money_Flow_Sum <= 8.22235e+06 )
								ret := 0.210884
							if( Positive_Money_Flow_Sum > 8.22235e+06 )
								ret := -0.636364
						if( MFI > 64.2393 )
							if( Negative_Money_Flow_Sum <= 3.9095e+06 )
								ret := -0.480916
							if( Negative_Money_Flow_Sum > 3.9095e+06 )
								ret := 0.088889
				if( Negative_Money_Flow_Sum > 5.31221e+06 )
					if( Typical_Price <= 478.165 )
						if( rsi1 <= 56.9511 )
							if( Negative_Money_Flow_Sum <= 8.62116e+06 )
								ret := -0.012739
							if( Negative_Money_Flow_Sum > 8.62116e+06 )
								ret := 0.561538
						if( rsi1 > 56.9511 )
							if( Typical_Price <= 127.569 )
								ret := 0.324675
							if( Typical_Price > 127.569 )
								ret := 0.691466
					if( Typical_Price > 478.165 )
						if( Positive_Money_Flow_Sum <= 4.25564e+07 )
							if( rsi1 <= 57.9582 )
								ret := 0.250000
							if( rsi1 > 57.9582 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 4.25564e+07 )
							if( Raw_Money_Flow <= 6.01889e+06 )
								ret := -0.814815 // sell
							if( Raw_Money_Flow > 6.01889e+06 )
								ret := 0.500000
			if( k > 32.7365 )
				if( d_k <= 0.788187 )
					if( Typical_Price <= 106.505 )
						if( Negative_Money_Flow <= 112059 )
							if( rsi1 <= 66.6687 )
								ret := 0.288575
							if( rsi1 > 66.6687 )
								ret := 0.549431
						if( Negative_Money_Flow > 112059 )
							if( Positive_Money_Flow_Sum <= 4.14971e+06 )
								ret := 0.680995
							if( Positive_Money_Flow_Sum > 4.14971e+06 )
								ret := 0.401152
					if( Typical_Price > 106.505 )
						if( rsi1 <= 64.9903 )
							if( MFI_High <= -30.7681 )
								ret := 0.696862
							if( MFI_High > -30.7681 )
								ret := 0.378049
						if( rsi1 > 64.9903 )
							if( MFI <= 67.6925 )
								ret := 0.779647 // buy
							if( MFI > 67.6925 )
								ret := 0.671329
				if( d_k > 0.788187 )
					if( rsi1 <= 66.7335 )
						if( MFI <= 59.1641 )
							if( Positive_Money_Flow_Sum <= 3.86876e+07 )
								ret := 0.375710
							if( Positive_Money_Flow_Sum > 3.86876e+07 )
								ret := -0.736842 // sell
						if( MFI > 59.1641 )
							if( MFI_High <= -2.33105 )
								ret := 0.072829
							if( MFI_High > -2.33105 )
								ret := -0.533333
					if( rsi1 > 66.7335 )
						if( Positive_Money_Flow <= 4.2921e+06 )
							if( MFI_Low <= 59.6585 )
								ret := 0.569011
							if( MFI_Low > 59.6585 )
								ret := 0.405858
						if( Positive_Money_Flow > 4.2921e+06 )
							if( Typical_Price <= 491.327 )
								ret := 0.222222
							if( Typical_Price > 491.327 )
								ret := -0.833333 // sell
		if( d_k > 4.02296 )
			if( Positive_Money_Flow <= 452084 )
				if( rsi1 <= 62.8383 )
					if( MFI_Low <= 47.3435 )
						if( MFI_High <= -33.8305 )
							if( Raw_Money_Flow <= 299824 )
								ret := 0.317308
							if( Raw_Money_Flow > 299824 )
								ret := 0.666667
						if( MFI_High > -33.8305 )
							if( Positive_Money_Flow_Sum <= 6.9191e+07 )
								ret := 0.098485
							if( Positive_Money_Flow_Sum > 6.9191e+07 )
								ret := -0.812500 // sell
					if( MFI_Low > 47.3435 )
						if( Raw_Money_Flow <= 178081 )
							if( Positive_Money_Flow_Sum <= 3.795e+06 )
								ret := -0.011257
							if( Positive_Money_Flow_Sum > 3.795e+06 )
								ret := -0.473684
						if( Raw_Money_Flow > 178081 )
							if( Positive_Money_Flow_Sum <= 1.63752e+07 )
								ret := -0.309480
							if( Positive_Money_Flow_Sum > 1.63752e+07 )
								ret := -0.600806
				if( rsi1 > 62.8383 )
					if( MFI_High <= 2.95242 )
						if( rsi1 <= 72.3095 )
							if( Positive_Money_Flow_Sum <= 5.49487e+07 )
								ret := 0.331407
							if( Positive_Money_Flow_Sum > 5.49487e+07 )
								ret := -0.615385
						if( rsi1 > 72.3095 )
							if( Positive_Money_Flow_Sum <= 403871 )
								ret := 0.000000
							if( Positive_Money_Flow_Sum > 403871 )
								ret := 0.618307
					if( MFI_High > 2.95242 )
						if( d_k <= 7.44674 )
							if( rsi1 <= 80.8809 )
								ret := 0.147541
							if( rsi1 > 80.8809 )
								ret := 0.694444
						if( d_k > 7.44674 )
							if( Raw_Money_Flow <= 229225 )
								ret := 0.133333
							if( Raw_Money_Flow > 229225 )
								ret := -0.316364
			if( Positive_Money_Flow > 452084 )
				if( smoothK_k <= 73.1572 )
					if( rsi1 <= 73.0176 )
						if( Money_Flow_Ratio <= 1.50819 )
							if( rsi1 <= 57.0474 )
								ret := -0.326531
							if( rsi1 > 57.0474 )
								ret := 0.262570
						if( Money_Flow_Ratio > 1.50819 )
							if( d_k <= 12.701 )
								ret := -0.384554
							if( d_k > 12.701 )
								ret := -0.651449
					if( rsi1 > 73.0176 )
						if( MFI_High <= 0.698759 )
							if( Negative_Money_Flow_Sum <= 3.84765e+07 )
								ret := 0.500000
							if( Negative_Money_Flow_Sum > 3.84765e+07 )
								ret := 1.000000 // buy
						if( MFI_High > 0.698759 )
							if( Positive_Money_Flow <= 2.21345e+06 )
								ret := 0.143750
							if( Positive_Money_Flow > 2.21345e+06 )
								ret := -0.519481
				if( smoothK_k > 73.1572 )
					if( Money_Flow_Ratio <= 5.53516 )
						if( Typical_Price <= 166.139 )
							if( MFI_High <= -35.8013 )
								ret := 0.925000 // buy
							if( MFI_High > -35.8013 )
								ret := 0.177778
						if( Typical_Price > 166.139 )
							if( rsi1 <= 63.8013 )
								ret := -0.486911
							if( rsi1 > 63.8013 )
								ret := 0.061475
					if( Money_Flow_Ratio > 5.53516 )
						if( rsi1 <= 80.0912 )
							if( smoothK_k <= 81.4976 )
								ret := 0.125000
							if( smoothK_k > 81.4976 )
								ret := 0.567568
						if( rsi1 > 80.0912 )
							if( Typical_Price <= 92.5942 )
								ret := 0.272727
							if( Typical_Price > 92.5942 )
								ret := 0.764151 // buy
	
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
float op_operation = decision_tree_0_AAVEUSDT_30Min_258844a5(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


