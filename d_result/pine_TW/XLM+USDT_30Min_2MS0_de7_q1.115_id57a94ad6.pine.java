//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: XLMUSDT_30Min_2MS0_57a94ad6 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XLMUSDT_30Min_2MS0_57a94ad6", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XLMUSDT_30Min_57a94ad6(Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum, smoothK_k, d_k, k, smoothD_d, rsi1, d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=7, max_features=0.5,min_samples_leaf=4, random_state=843828734)
	if( rsi1 <= 49.0959 )
		if( d_k <= -4.43354 )
			if( d <= 15.5217 )
				if( rsi1 <= 27.6376 )
					if( MFI <= 11.8067 )
						if( Typical_Price <= 0.331917 )
							if( k <= 19.2179 )
								ret := -0.161290
							if( k > 19.2179 )
								ret := 0.421053
						if( Typical_Price > 0.331917 )
							ret := -0.857143 // sell
					if( MFI > 11.8067 )
						if( Negative_Money_Flow_Sum <= 2.0494e+06 )
							if( Positive_Money_Flow_Sum <= 97214 )
								ret := 0.000000
							if( Positive_Money_Flow_Sum > 97214 )
								ret := -0.764151 // sell
						if( Negative_Money_Flow_Sum > 2.0494e+06 )
							if( d <= 4.98654 )
								ret := -0.822222 // sell
							if( d > 4.98654 )
								ret := -0.456790
				if( rsi1 > 27.6376 )
					if( Money_Flow_Ratio <= 0.690803 )
						if( Money_Flow_Ratio <= 0.32257 )
							if( Positive_Money_Flow_Sum <= 913639 )
								ret := 0.062500
							if( Positive_Money_Flow_Sum > 913639 )
								ret := 0.489796
						if( Money_Flow_Ratio > 0.32257 )
							if( rsi1 <= 37.7709 )
								ret := -0.157804
							if( rsi1 > 37.7709 )
								ret := 0.145455
					if( Money_Flow_Ratio > 0.690803 )
						if( Typical_Price <= 0.255261 )
							if( rsi1 <= 38.0528 )
								ret := -0.620155
							if( rsi1 > 38.0528 )
								ret := -0.284895
						if( Typical_Price > 0.255261 )
							if( Raw_Money_Flow <= 1.93524e+06 )
								ret := -0.085470
							if( Raw_Money_Flow > 1.93524e+06 )
								ret := 0.300000
			if( d > 15.5217 )
				if( Raw_Money_Flow <= 269118 )
					if( rsi1 <= 43.4527 )
						if( MFI <= 30.9061 )
							if( Positive_Money_Flow <= 12840.3 )
								ret := 0.163866
							if( Positive_Money_Flow > 12840.3 )
								ret := -0.088825
						if( MFI > 30.9061 )
							if( rsi1 <= 36.8358 )
								ret := -0.463869
							if( rsi1 > 36.8358 )
								ret := -0.174905
					if( rsi1 > 43.4527 )
						if( MFI <= 47.9929 )
							if( Negative_Money_Flow <= 66339.6 )
								ret := 0.189099
							if( Negative_Money_Flow > 66339.6 )
								ret := 0.461988
						if( MFI > 47.9929 )
							if( Positive_Money_Flow <= 126758 )
								ret := -0.127737
							if( Positive_Money_Flow > 126758 )
								ret := -0.460317
				if( Raw_Money_Flow > 269118 )
					if( rsi1 <= 31.2708 )
						if( Negative_Money_Flow <= 432019 )
							if( Positive_Money_Flow_Sum <= 775521 )
								ret := 0.150943
							if( Positive_Money_Flow_Sum > 775521 )
								ret := -0.414035
						if( Negative_Money_Flow > 432019 )
							if( rsi1 <= 24.1762 )
								ret := -0.350877
							if( rsi1 > 24.1762 )
								ret := 0.280120
					if( rsi1 > 31.2708 )
						if( MFI <= 35.659 )
							if( rsi1 <= 38.7274 )
								ret := 0.381403
							if( rsi1 > 38.7274 )
								ret := 0.640174
						if( MFI > 35.659 )
							if( MFI <= 47.0624 )
								ret := 0.282581
							if( MFI > 47.0624 )
								ret := -0.122330
		if( d_k > -4.43354 )
			if( rsi1 <= 35.2819 )
				if( Money_Flow_Ratio <= 0.597712 )
					if( rsi1 <= 27.2667 )
						if( Negative_Money_Flow <= 4.58961e+06 )
							if( MFI <= 27.176 )
								ret := -0.551406
							if( MFI > 27.176 )
								ret := -0.721047 // sell
						if( Negative_Money_Flow > 4.58961e+06 )
							if( Negative_Money_Flow_Sum <= 6.13534e+07 )
								ret := 0.207921
							if( Negative_Money_Flow_Sum > 6.13534e+07 )
								ret := -0.551020
					if( rsi1 > 27.2667 )
						if( Negative_Money_Flow <= 1.46742e+06 )
							if( Money_Flow_Ratio <= 0.186458 )
								ret := 0.365517
							if( Money_Flow_Ratio > 0.186458 )
								ret := -0.448819
						if( Negative_Money_Flow > 1.46742e+06 )
							if( MFI_Low <= 1.8624 )
								ret := 0.500000
							if( MFI_Low > 1.8624 )
								ret := -0.033126
				if( Money_Flow_Ratio > 0.597712 )
					if( Positive_Money_Flow_Sum <= 405934 )
						if( rsi1 <= 24.9761 )
							if( MFI_High <= -23.0004 )
								ret := -0.657534
							if( MFI_High > -23.0004 )
								ret := -0.111111
						if( rsi1 > 24.9761 )
							if( Typical_Price <= 0.102309 )
								ret := -0.385390
							if( Typical_Price > 0.102309 )
								ret := -0.123188
					if( Positive_Money_Flow_Sum > 405934 )
						if( Positive_Money_Flow_Sum <= 1.03497e+06 )
							if( Typical_Price <= 0.084563 )
								ret := -0.324742
							if( Typical_Price > 0.084563 )
								ret := -0.668772
						if( Positive_Money_Flow_Sum > 1.03497e+06 )
							if( d_k <= 2.54393 )
								ret := -0.673673
							if( d_k > 2.54393 )
								ret := -0.840128 // sell
			if( rsi1 > 35.2819 )
				if( Money_Flow_Ratio <= 0.773322 )
					if( MFI_High <= -50.9264 )
						if( Positive_Money_Flow_Sum <= 7.24852e+06 )
							if( Negative_Money_Flow <= 73426.5 )
								ret := -0.067610
							if( Negative_Money_Flow > 73426.5 )
								ret := 0.285899
						if( Positive_Money_Flow_Sum > 7.24852e+06 )
							if( Positive_Money_Flow_Sum <= 1.96827e+07 )
								ret := 0.834862 // buy
							if( Positive_Money_Flow_Sum > 1.96827e+07 )
								ret := -0.357143
					if( MFI_High > -50.9264 )
						if( Positive_Money_Flow <= 48319.4 )
							if( Typical_Price <= 0.131097 )
								ret := 0.011587
							if( Typical_Price > 0.131097 )
								ret := -0.165111
						if( Positive_Money_Flow > 48319.4 )
							if( Typical_Price <= 0.09174 )
								ret := 0.025862
							if( Typical_Price > 0.09174 )
								ret := -0.314558
				if( Money_Flow_Ratio > 0.773322 )
					if( Positive_Money_Flow_Sum <= 1.10629e+06 )
						if( MFI_High <= -24.9197 )
							if( Positive_Money_Flow <= 42351.2 )
								ret := -0.110312
							if( Positive_Money_Flow > 42351.2 )
								ret := -0.351531
						if( MFI_High > -24.9197 )
							if( Raw_Money_Flow <= 71979.6 )
								ret := -0.288054
							if( Raw_Money_Flow > 71979.6 )
								ret := -0.488520
					if( Positive_Money_Flow_Sum > 1.10629e+06 )
						if( d_k <= 0.703692 )
							if( rsi1 <= 47.382 )
								ret := -0.410160
							if( rsi1 > 47.382 )
								ret := -0.017192
						if( d_k > 0.703692 )
							if( Money_Flow_Ratio <= 1.30616 )
								ret := -0.517660
							if( Money_Flow_Ratio > 1.30616 )
								ret := -0.696109
	if( rsi1 > 49.0959 )
		if( MFI <= 60.3348 )
			if( rsi1 <= 57.2007 )
				if( MFI <= 46.124 )
					if( Raw_Money_Flow <= 112243 )
						if( Negative_Money_Flow <= 63051.9 )
							if( rsi1 <= 49.9749 )
								ret := 0.576923
							if( rsi1 > 49.9749 )
								ret := 0.190509
						if( Negative_Money_Flow > 63051.9 )
							if( d_k <= 4.47137 )
								ret := 0.516393
							if( d_k > 4.47137 )
								ret := 0.080645
					if( Raw_Money_Flow > 112243 )
						if( d_k <= -0.905244 )
							if( MFI_Low <= 23.0137 )
								ret := 0.693554
							if( MFI_Low > 23.0137 )
								ret := 0.475036
						if( d_k > -0.905244 )
							if( Positive_Money_Flow <= 1.6578e+06 )
								ret := 0.227528
							if( Positive_Money_Flow > 1.6578e+06 )
								ret := -0.647059
				if( MFI > 46.124 )
					if( rsi1 <= 53.9075 )
						if( Negative_Money_Flow <= 1798.69 )
							if( Money_Flow_Ratio <= 1.26938 )
								ret := -0.068606
							if( Money_Flow_Ratio > 1.26938 )
								ret := -0.370253
						if( Negative_Money_Flow > 1798.69 )
							if( d_k <= -1.32044 )
								ret := 0.350877
							if( d_k > -1.32044 )
								ret := -0.015280
					if( rsi1 > 53.9075 )
						if( d_k <= 0.244021 )
							if( Negative_Money_Flow <= 137863 )
								ret := 0.236305
							if( Negative_Money_Flow > 137863 )
								ret := 0.595281
						if( d_k > 0.244021 )
							if( Positive_Money_Flow_Sum <= 2.89793e+07 )
								ret := 0.072257
							if( Positive_Money_Flow_Sum > 2.89793e+07 )
								ret := -0.390244
			if( rsi1 > 57.2007 )
				if( d_k <= -4e-06 )
					if( Raw_Money_Flow <= 91013.3 )
						if( Raw_Money_Flow <= 46999.6 )
							if( d_k <= -5.16163 )
								ret := 0.230303
							if( d_k > -5.16163 )
								ret := 0.429630
						if( Raw_Money_Flow > 46999.6 )
							if( MFI <= 58.7842 )
								ret := 0.521869
							if( MFI > 58.7842 )
								ret := 0.010417
					if( Raw_Money_Flow > 91013.3 )
						if( Positive_Money_Flow <= 4.48326e+06 )
							if( rsi1 <= 62.9631 )
								ret := 0.612774
							if( rsi1 > 62.9631 )
								ret := 0.763089 // buy
						if( Positive_Money_Flow > 4.48326e+06 )
							if( MFI_Low <= 35.7218 )
								ret := 0.487805
							if( MFI_Low > 35.7218 )
								ret := -0.258065
				if( d_k > -4e-06 )
					if( rsi1 <= 62.5146 )
						if( Positive_Money_Flow_Sum <= 5.97592e+07 )
							if( Positive_Money_Flow <= 7875.83 )
								ret := 0.424973
							if( Positive_Money_Flow > 7875.83 )
								ret := 0.172983
						if( Positive_Money_Flow_Sum > 5.97592e+07 )
							if( d <= 47.1182 )
								ret := 0.000000
							if( d > 47.1182 )
								ret := -0.750000 // sell
					if( rsi1 > 62.5146 )
						if( Positive_Money_Flow_Sum <= 4.95332e+07 )
							if( Raw_Money_Flow <= 75174.1 )
								ret := 0.404342
							if( Raw_Money_Flow > 75174.1 )
								ret := 0.571825
						if( Positive_Money_Flow_Sum > 4.95332e+07 )
							if( k <= 77.2299 )
								ret := -0.875000 // sell
							if( k > 77.2299 )
								ret := 0.631579
		if( MFI > 60.3348 )
			if( rsi1 <= 65.4456 )
				if( Money_Flow_Ratio <= 2.44249 )
					if( d_k <= 0.878161 )
						if( Positive_Money_Flow <= 17162.3 )
							if( Typical_Price <= 0.134015 )
								ret := 0.194595
							if( Typical_Price > 0.134015 )
								ret := 0.572755
						if( Positive_Money_Flow > 17162.3 )
							if( Negative_Money_Flow_Sum <= 1.62751e+06 )
								ret := -0.071090
							if( Negative_Money_Flow_Sum > 1.62751e+06 )
								ret := 0.201266
					if( d_k > 0.878161 )
						if( Positive_Money_Flow <= 104558 )
							if( Typical_Price <= 0.159201 )
								ret := 0.090790
							if( Typical_Price > 0.159201 )
								ret := -0.083624
						if( Positive_Money_Flow > 104558 )
							if( rsi1 <= 56.7197 )
								ret := -0.591078
							if( rsi1 > 56.7197 )
								ret := -0.156846
				if( Money_Flow_Ratio > 2.44249 )
					if( Positive_Money_Flow <= 289035 )
						if( Raw_Money_Flow <= 84714.5 )
							if( MFI_Low <= 53.5349 )
								ret := 0.156250
							if( MFI_Low > 53.5349 )
								ret := -0.108209
						if( Raw_Money_Flow > 84714.5 )
							if( d_k <= 5.38367 )
								ret := -0.097826
							if( d_k > 5.38367 )
								ret := -0.409873
					if( Positive_Money_Flow > 289035 )
						if( d_k <= 7.72058 )
							if( rsi1 <= 58.9721 )
								ret := -0.724382 // sell
							if( rsi1 > 58.9721 )
								ret := -0.326087
						if( d_k > 7.72058 )
							if( Raw_Money_Flow <= 1.37374e+06 )
								ret := -0.698413
							if( Raw_Money_Flow > 1.37374e+06 )
								ret := -0.875494 // sell
			if( rsi1 > 65.4456 )
				if( rsi1 <= 75.0362 )
					if( Money_Flow_Ratio <= 3.88106 )
						if( Typical_Price <= 0.088329 )
							if( Positive_Money_Flow_Sum <= 1.08618e+06 )
								ret := 0.283154
							if( Positive_Money_Flow_Sum > 1.08618e+06 )
								ret := -0.145390
						if( Typical_Price > 0.088329 )
							if( d_k <= -0.534878 )
								ret := 0.574554
							if( d_k > -0.534878 )
								ret := 0.280339
					if( Money_Flow_Ratio > 3.88106 )
						if( d_k <= 5.1115 )
							if( Negative_Money_Flow <= 2380.32 )
								ret := 0.059548
							if( Negative_Money_Flow > 2380.32 )
								ret := 0.496552
						if( d_k > 5.1115 )
							if( Positive_Money_Flow <= 422329 )
								ret := -0.039216
							if( Positive_Money_Flow > 422329 )
								ret := -0.566489
				if( rsi1 > 75.0362 )
					if( Positive_Money_Flow_Sum <= 2.4024e+07 )
						if( Typical_Price <= 0.086556 )
							if( Raw_Money_Flow <= 542142 )
								ret := 0.293333
							if( Raw_Money_Flow > 542142 )
								ret := -0.250000
						if( Typical_Price > 0.086556 )
							if( MFI_High <= -1.40705 )
								ret := 0.722538 // buy
							if( MFI_High > -1.40705 )
								ret := 0.596873
					if( Positive_Money_Flow_Sum > 2.4024e+07 )
						if( Typical_Price <= 0.360046 )
							if( Negative_Money_Flow_Sum <= 6.08659e+06 )
								ret := 0.730769 // buy
							if( Negative_Money_Flow_Sum > 6.08659e+06 )
								ret := -0.474359
						if( Typical_Price > 0.360046 )
							if( MFI_High <= 2.00268 )
								ret := 0.853933 // buy
							if( MFI_High > 2.00268 )
								ret := 0.173333
	
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
float op_operation = decision_tree_0_XLMUSDT_30Min_57a94ad6(Positive_Money_Flow_Sum, MFI, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, MFI_High, Typical_Price, Positive_Money_Flow, Negative_Money_Flow_Sum, smoothK_k, d_k, k, smoothD_d, rsi1, d)

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


