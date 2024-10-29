//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: LTCUSDT_15Min_2MS0_13c70a55 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_LTCUSDT_15Min_2MS0_13c70a55", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_LTCUSDT_15Min_13c70a55(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( k <= 44.4543 )
		if( Typical_Price <= 62.7047 )
			if( Money_Flow_Ratio <= 0.801628 )
				if( d <= 22.1231 )
					if( MFI_High <= -67.7416 )
						if( Positive_Money_Flow_Sum <= 1.54014e+06 )
							if( Negative_Money_Flow <= 9540 )
								ret := 0.025641
							if( Negative_Money_Flow > 9540 )
								ret := 0.417722
						if( Positive_Money_Flow_Sum > 1.54014e+06 )
							ret := -0.600000
					if( MFI_High > -67.7416 )
						if( Positive_Money_Flow_Sum <= 4.50575e+06 )
							if( Positive_Money_Flow_Sum <= 2.51365e+06 )
								ret := -0.057526
							if( Positive_Money_Flow_Sum > 2.51365e+06 )
								ret := -0.251485
						if( Positive_Money_Flow_Sum > 4.50575e+06 )
							if( MFI_Low <= 8.21978 )
								ret := 0.666667
							if( MFI_Low > 8.21978 )
								ret := 0.178571
				if( d > 22.1231 )
					if( rsi1 <= 28.5511 )
						if( Raw_Money_Flow <= 199269 )
							if( d_k <= -12.0454 )
								ret := 0.500000
							if( d_k > -12.0454 )
								ret := -0.552083
						if( Raw_Money_Flow > 199269 )
							if( rsi1 <= 22.3447 )
								ret := -0.423529
							if( rsi1 > 22.3447 )
								ret := 0.114833
					if( rsi1 > 28.5511 )
						if( Raw_Money_Flow <= 216398 )
							if( rsi1 <= 50.9925 )
								ret := 0.017857
							if( rsi1 > 50.9925 )
								ret := 0.438095
						if( Raw_Money_Flow > 216398 )
							if( smoothD_d <= 39.5368 )
								ret := 0.234893
							if( smoothD_d > 39.5368 )
								ret := 0.456349
			if( Money_Flow_Ratio > 0.801628 )
				if( rsi1 <= 45.1326 )
					if( Typical_Price <= 57.435 )
						if( MFI <= 45.7904 )
							if( k <= 23.5651 )
								ret := -0.569231
							if( k > 23.5651 )
								ret := 0.022727
						if( MFI > 45.7904 )
							if( Negative_Money_Flow_Sum <= 1.81417e+06 )
								ret := -0.108359
							if( Negative_Money_Flow_Sum > 1.81417e+06 )
								ret := 0.217593
					if( Typical_Price > 57.435 )
						if( Negative_Money_Flow_Sum <= 1.92673e+06 )
							if( d <= 11.177 )
								ret := -0.419162
							if( d > 11.177 )
								ret := -0.708920 // sell
						if( Negative_Money_Flow_Sum > 1.92673e+06 )
							if( Negative_Money_Flow <= 752746 )
								ret := -0.140969
							if( Negative_Money_Flow > 752746 )
								ret := -0.833333 // sell
				if( rsi1 > 45.1326 )
					if( Positive_Money_Flow <= 65218.5 )
						if( Negative_Money_Flow_Sum <= 7.83659e+06 )
							if( Positive_Money_Flow_Sum <= 2.78097e+06 )
								ret := 0.132383
							if( Positive_Money_Flow_Sum > 2.78097e+06 )
								ret := -0.069519
						if( Negative_Money_Flow_Sum > 7.83659e+06 )
							if( Money_Flow_Ratio <= 1.19599 )
								ret := 0.181818
							if( Money_Flow_Ratio > 1.19599 )
								ret := 0.833333 // buy
					if( Positive_Money_Flow > 65218.5 )
						if( MFI <= 78.7908 )
							if( rsi1 <= 56.1035 )
								ret := -0.234669
							if( rsi1 > 56.1035 )
								ret := -0.010249
						if( MFI > 78.7908 )
							if( Typical_Price <= 62.5864 )
								ret := -0.752577 // sell
							if( Typical_Price > 62.5864 )
								ret := 0.250000
		if( Typical_Price > 62.7047 )
			if( rsi1 <= 35.5959 )
				if( MFI <= 30.7444 )
					if( rsi1 <= 28.5417 )
						if( MFI_High <= -61.0053 )
							if( Negative_Money_Flow_Sum <= 1.6595e+07 )
								ret := -0.279121
							if( Negative_Money_Flow_Sum > 1.6595e+07 )
								ret := 0.073048
						if( MFI_High > -61.0053 )
							if( Raw_Money_Flow <= 1.07721e+07 )
								ret := -0.527172
							if( Raw_Money_Flow > 1.07721e+07 )
								ret := 1.000000 // buy
					if( rsi1 > 28.5417 )
						if( Negative_Money_Flow <= 903826 )
							if( Raw_Money_Flow <= 664533 )
								ret := -0.232432
							if( Raw_Money_Flow > 664533 )
								ret := -0.025761
						if( Negative_Money_Flow > 903826 )
							if( Negative_Money_Flow <= 3.97265e+06 )
								ret := 0.123364
							if( Negative_Money_Flow > 3.97265e+06 )
								ret := 0.808219 // buy
				if( MFI > 30.7444 )
					if( rsi1 <= 29.629 )
						if( Raw_Money_Flow <= 130218 )
							if( k <= 0.602529 )
								ret := -0.358696
							if( k > 0.602529 )
								ret := -0.585052
						if( Raw_Money_Flow > 130218 )
							if( MFI_Low <= 20.2738 )
								ret := -0.671562
							if( MFI_Low > 20.2738 )
								ret := -0.787606 // sell
					if( rsi1 > 29.629 )
						if( MFI_High <= -34.6546 )
							if( MFI_Low <= 14.6836 )
								ret := -0.244502
							if( MFI_Low > 14.6836 )
								ret := -0.456534
						if( MFI_High > -34.6546 )
							if( Positive_Money_Flow <= 635367 )
								ret := -0.645206
							if( Positive_Money_Flow > 635367 )
								ret := -0.894515 // sell
			if( rsi1 > 35.5959 )
				if( Money_Flow_Ratio <= 0.927814 )
					if( rsi1 <= 46.4961 )
						if( MFI <= 34.1039 )
							if( Negative_Money_Flow <= 407218 )
								ret := -0.017013
							if( Negative_Money_Flow > 407218 )
								ret := 0.351351
						if( MFI > 34.1039 )
							if( rsi1 <= 39.9982 )
								ret := -0.298876
							if( rsi1 > 39.9982 )
								ret := -0.118969
					if( rsi1 > 46.4961 )
						if( smoothD_d <= 22.8587 )
							if( Positive_Money_Flow <= 323875 )
								ret := 0.078387
							if( Positive_Money_Flow > 323875 )
								ret := -0.180272
						if( smoothD_d > 22.8587 )
							if( smoothD_d <= 49.386 )
								ret := 0.301992
							if( smoothD_d > 49.386 )
								ret := -0.071429
				if( Money_Flow_Ratio > 0.927814 )
					if( rsi1 <= 49.0976 )
						if( Money_Flow_Ratio <= 2.19537 )
							if( Positive_Money_Flow_Sum <= 4.43658e+07 )
								ret := -0.432684
							if( Positive_Money_Flow_Sum > 4.43658e+07 )
								ret := 0.843750 // buy
						if( Money_Flow_Ratio > 2.19537 )
							if( Positive_Money_Flow <= 260947 )
								ret := -0.536873
							if( Positive_Money_Flow > 260947 )
								ret := -0.811382 // sell
					if( rsi1 > 49.0976 )
						if( Negative_Money_Flow <= 22315.4 )
							if( MFI_Low <= 50.3763 )
								ret := -0.183621
							if( MFI_Low > 50.3763 )
								ret := -0.466310
						if( Negative_Money_Flow > 22315.4 )
							if( Positive_Money_Flow_Sum <= 2.69005e+07 )
								ret := 0.019627
							if( Positive_Money_Flow_Sum > 2.69005e+07 )
								ret := 0.485149
	if( k > 44.4543 )
		if( k <= 76.7305 )
			if( Positive_Money_Flow <= 52835.3 )
				if( rsi1 <= 50.002 )
					if( MFI_Low <= 20.0396 )
						if( Raw_Money_Flow <= 1.00107e+06 )
							if( rsi1 <= 37.7439 )
								ret := -0.107843
							if( rsi1 > 37.7439 )
								ret := 0.289162
						if( Raw_Money_Flow > 1.00107e+06 )
							if( Negative_Money_Flow_Sum <= 1.78784e+07 )
								ret := 0.579641
							if( Negative_Money_Flow_Sum > 1.78784e+07 )
								ret := 0.203846
					if( MFI_Low > 20.0396 )
						if( d_k <= 10.6147 )
							if( MFI_Low <= 26.1739 )
								ret := -0.051706
							if( MFI_Low > 26.1739 )
								ret := -0.244212
						if( d_k > 10.6147 )
							if( MFI <= 60.9239 )
								ret := 0.162518
							if( MFI > 60.9239 )
								ret := -0.241379
				if( rsi1 > 50.002 )
					if( MFI_High <= -31.0356 )
						if( MFI_High <= -36.1755 )
							if( d_k <= -21.7706 )
								ret := 0.252252
							if( d_k > -21.7706 )
								ret := 0.666667
						if( MFI_High > -36.1755 )
							if( Typical_Price <= 60.4606 )
								ret := 0.101852
							if( Typical_Price > 60.4606 )
								ret := 0.500600
					if( MFI_High > -31.0356 )
						if( MFI_Low <= 41.3572 )
							if( rsi1 <= 60.0035 )
								ret := 0.182341
							if( rsi1 > 60.0035 )
								ret := 0.501401
						if( MFI_Low > 41.3572 )
							if( Negative_Money_Flow_Sum <= 3.53518e+06 )
								ret := 0.057070
							if( Negative_Money_Flow_Sum > 3.53518e+06 )
								ret := 0.332447
			if( Positive_Money_Flow > 52835.3 )
				if( smoothK_k <= 61.6664 )
					if( Money_Flow_Ratio <= 2.0988 )
						if( rsi1 <= 60.4109 )
							if( MFI_Low <= 27.5086 )
								ret := 0.012391
							if( MFI_Low > 27.5086 )
								ret := -0.181645
						if( rsi1 > 60.4109 )
							if( Positive_Money_Flow <= 968644 )
								ret := 0.350222
							if( Positive_Money_Flow > 968644 )
								ret := 0.037267
					if( Money_Flow_Ratio > 2.0988 )
						if( rsi1 <= 65.6424 )
							if( d <= 71.4926 )
								ret := -0.473535
							if( d > 71.4926 )
								ret := 0.110390
						if( rsi1 > 65.6424 )
							if( Positive_Money_Flow <= 313052 )
								ret := 0.226562
							if( Positive_Money_Flow > 313052 )
								ret := -0.087019
				if( smoothK_k > 61.6664 )
					if( Money_Flow_Ratio <= 2.67168 )
						if( Money_Flow_Ratio <= 0.419626 )
							if( rsi1 <= 36.7699 )
								ret := -0.173469
							if( rsi1 > 36.7699 )
								ret := 0.448370
						if( Money_Flow_Ratio > 0.419626 )
							if( rsi1 <= 55.914 )
								ret := -0.086340
							if( rsi1 > 55.914 )
								ret := 0.269496
					if( Money_Flow_Ratio > 2.67168 )
						if( smoothD_d <= 79.2297 )
							if( d_k <= -13.6828 )
								ret := 0.213115
							if( d_k > -13.6828 )
								ret := -0.132620
						if( smoothD_d > 79.2297 )
							if( Raw_Money_Flow <= 584401 )
								ret := 0.197368
							if( Raw_Money_Flow > 584401 )
								ret := 0.600000
		if( k > 76.7305 )
			if( Negative_Money_Flow <= 135818 )
				if( Typical_Price <= 59.9103 )
					if( Positive_Money_Flow_Sum <= 1.29694e+07 )
						if( MFI_High <= -5.40825 )
							if( Typical_Price <= 58.0833 )
								ret := -0.045913
							if( Typical_Price > 58.0833 )
								ret := 0.188235
						if( MFI_High > -5.40825 )
							if( Money_Flow_Ratio <= 4.79745 )
								ret := -0.377049
							if( Money_Flow_Ratio > 4.79745 )
								ret := -0.007782
					if( Positive_Money_Flow_Sum > 1.29694e+07 )
						if( Positive_Money_Flow <= 1.02365e+06 )
							if( rsi1 <= 74.0266 )
								ret := 0.750000 // buy
							if( rsi1 > 74.0266 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow > 1.02365e+06 )
							if( rsi1 <= 79.1573 )
								ret := 0.791667 // buy
							if( rsi1 > 79.1573 )
								ret := 0.000000
				if( Typical_Price > 59.9103 )
					if( rsi1 <= 60.8403 )
						if( MFI_High <= -31.4503 )
							if( d_k <= -15.1091 )
								ret := 0.073919
							if( d_k > -15.1091 )
								ret := 0.248665
						if( MFI_High > -31.4503 )
							if( rsi1 <= 54.3928 )
								ret := -0.146099
							if( rsi1 > 54.3928 )
								ret := 0.104823
					if( rsi1 > 60.8403 )
						if( Money_Flow_Ratio <= 2.21105 )
							if( rsi1 <= 71.5236 )
								ret := 0.416948
							if( rsi1 > 71.5236 )
								ret := 0.643324
						if( Money_Flow_Ratio > 2.21105 )
							if( Typical_Price <= 69.4531 )
								ret := 0.144317
							if( Typical_Price > 69.4531 )
								ret := 0.337890
			if( Negative_Money_Flow > 135818 )
				if( MFI <= 47.315 )
					if( Typical_Price <= 56.9268 )
						if( Negative_Money_Flow <= 166133 )
							if( d <= 78.116 )
								ret := -0.222222
							if( d > 78.116 )
								ret := 0.692308
						if( Negative_Money_Flow > 166133 )
							if( Positive_Money_Flow_Sum <= 2.12676e+06 )
								ret := 0.184466
							if( Positive_Money_Flow_Sum > 2.12676e+06 )
								ret := -0.182927
					if( Typical_Price > 56.9268 )
						if( rsi1 <= 48.3916 )
							if( Raw_Money_Flow <= 941243 )
								ret := 0.160930
							if( Raw_Money_Flow > 941243 )
								ret := 0.521569
						if( rsi1 > 48.3916 )
							if( rsi1 <= 57.2828 )
								ret := 0.543218
							if( rsi1 > 57.2828 )
								ret := 0.709983 // buy
				if( MFI > 47.315 )
					if( Typical_Price <= 62.2091 )
						if( Raw_Money_Flow <= 3.98795e+06 )
							if( rsi1 <= 93.9559 )
								ret := 0.170661
							if( rsi1 > 93.9559 )
								ret := -1.000000 // sell
						if( Raw_Money_Flow > 3.98795e+06 )
							ret := -1.000000 // sell
					if( Typical_Price > 62.2091 )
						if( rsi1 <= 63.7161 )
							if( Money_Flow_Ratio <= 1.74191 )
								ret := 0.157524
							if( Money_Flow_Ratio > 1.74191 )
								ret := -0.118132
						if( rsi1 > 63.7161 )
							if( MFI_High <= -12.7063 )
								ret := 0.651478
							if( MFI_High > -12.7063 )
								ret := 0.295262
	
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
float op_operation = decision_tree_0_LTCUSDT_15Min_13c70a55(Positive_Money_Flow_Sum, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Negative_Money_Flow_Sum, Positive_Money_Flow, Money_Flow_Ratio, MFI, MFI_High, Typical_Price, d, d_k, smoothK_k, k, rsi1, smoothD_d)

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


