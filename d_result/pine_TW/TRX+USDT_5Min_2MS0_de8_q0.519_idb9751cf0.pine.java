//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Stochastic_RSI
// ID_model: TRXUSDT_5Min_2MS0_b9751cf0 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_TRXUSDT_5Min_2MS0_b9751cf0", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_TRXUSDT_5Min_b9751cf0(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, d_k, d, rsi1, k, smoothD_d, smoothK_k)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( MFI <= 90.349 )
		if( Negative_Money_Flow_Sum <= 9.15524e+06 )
			if( MFI_High <= -65.1042 )
				if( Negative_Money_Flow <= 106453 )
					if( Money_Flow_Ratio <= 0.102674 )
						if( Typical_Price <= 0.135026 )
							if( Negative_Money_Flow_Sum <= 5.58305e+06 )
								if( Typical_Price <= 0.10123 )
									ret := 0.344111
								if( Typical_Price > 0.10123 )
									ret := 0.050100
							if( Negative_Money_Flow_Sum > 5.58305e+06 )
								if( Typical_Price <= 0.121097 )
									ret := 0.866667 // buy
								if( Typical_Price > 0.121097 )
									ret := 0.366667
						if( Typical_Price > 0.135026 )
							if( smoothK_k <= 10.6556 )
								if( MFI_Low <= -18.9572 )
									ret := -0.500000
								if( MFI_Low > -18.9572 )
									ret := 0.322222
							if( smoothK_k > 10.6556 )
								if( Money_Flow_Ratio <= 0.089129 )
									ret := -0.575758
								if( Money_Flow_Ratio > 0.089129 )
									ret := 0.096774
					if( Money_Flow_Ratio > 0.102674 )
						if( rsi1 <= 37.5692 )
							if( Negative_Money_Flow_Sum <= 4.70508e+06 )
								if( Negative_Money_Flow_Sum <= 4.51514e+06 )
									ret := 0.008097
								if( Negative_Money_Flow_Sum > 4.51514e+06 )
									ret := 0.888889 // buy
							if( Negative_Money_Flow_Sum > 4.70508e+06 )
								if( Typical_Price <= 0.110768 )
									ret := -0.138614
								if( Typical_Price > 0.110768 )
									ret := -0.652850
						if( rsi1 > 37.5692 )
							if( Typical_Price <= 0.151013 )
								if( k <= 84.6302 )
									ret := -0.770833 // sell
								if( k > 84.6302 )
									ret := -0.071429
							if( Typical_Price > 0.151013 )
								if( MFI_High <= -66.7892 )
									ret := -0.047619
								if( MFI_High > -66.7892 )
									ret := -0.571429
				if( Negative_Money_Flow > 106453 )
					if( Typical_Price <= 0.129466 )
						if( Negative_Money_Flow_Sum <= 1.15249e+06 )
							if( d <= 34.8301 )
								if( MFI_High <= -67.6671 )
									ret := 0.381818
								if( MFI_High > -67.6671 )
									ret := -0.047170
							if( d > 34.8301 )
								if( Money_Flow_Ratio <= 0.146674 )
									ret := 0.795455 // buy
								if( Money_Flow_Ratio > 0.146674 )
									ret := 0.333333
						if( Negative_Money_Flow_Sum > 1.15249e+06 )
							if( Negative_Money_Flow <= 871322 )
								if( smoothK_k <= 43.0661 )
									ret := -0.303893
								if( smoothK_k > 43.0661 )
									ret := -0.550420
							if( Negative_Money_Flow > 871322 )
								if( smoothD_d <= -2.86084 )
									ret := -0.644444
								if( smoothD_d > -2.86084 )
									ret := 0.225543
					if( Typical_Price > 0.129466 )
						if( d_k <= 3.28924 )
							if( k <= 6.98354 )
								if( Typical_Price <= 0.153383 )
									ret := 0.554404
								if( Typical_Price > 0.153383 )
									ret := 0.050000
							if( k > 6.98354 )
								if( MFI <= 10.1394 )
									ret := 0.164179
								if( MFI > 10.1394 )
									ret := -0.272109
						if( d_k > 3.28924 )
							if( d_k <= 4.03634 )
								if( smoothK_k <= 2.00699 )
									ret := -0.842105 // sell
								if( smoothK_k > 2.00699 )
									ret := -0.416667
							if( d_k > 4.03634 )
								if( MFI <= 13.7421 )
									ret := 0.072165
								if( MFI > 13.7421 )
									ret := -0.400000
			if( MFI_High > -65.1042 )
				if( Negative_Money_Flow <= 471.066 )
					if( Typical_Price <= 0.118712 )
						if( Raw_Money_Flow <= 133862 )
							if( MFI_Low <= 0.395294 )
								if( Typical_Price <= 0.07488 )
									ret := 0.809524 // buy
								if( Typical_Price > 0.07488 )
									ret := -0.145647
							if( MFI_Low > 0.395294 )
								if( smoothD_d <= 22.0554 )
									ret := 0.042205
								if( smoothD_d > 22.0554 )
									ret := -0.016496
						if( Raw_Money_Flow > 133862 )
							if( d_k <= 3.14771 )
								if( MFI <= 44.4142 )
									ret := 0.201814
								if( MFI > 44.4142 )
									ret := 0.076460
							if( d_k > 3.14771 )
								if( Positive_Money_Flow_Sum <= 3.08865e+06 )
									ret := -0.059028
								if( Positive_Money_Flow_Sum > 3.08865e+06 )
									ret := -0.500000
					if( Typical_Price > 0.118712 )
						if( smoothK_k <= 12.9326 )
							if( rsi1 <= 18.8893 )
								if( MFI_Low <= -3.63831 )
									ret := -0.285714
								if( MFI_Low > -3.63831 )
									ret := 0.561224
							if( rsi1 > 18.8893 )
								if( smoothK_k <= 2.20746 )
									ret := 0.098433
								if( smoothK_k > 2.20746 )
									ret := -0.006355
						if( smoothK_k > 12.9326 )
							if( Positive_Money_Flow <= 3973.14 )
								if( Money_Flow_Ratio <= 4.36166 )
									ret := 0.029516
								if( Money_Flow_Ratio > 4.36166 )
									ret := 0.371968
							if( Positive_Money_Flow > 3973.14 )
								if( Positive_Money_Flow <= 435678 )
									ret := -0.117950
								if( Positive_Money_Flow > 435678 )
									ret := 0.040248
				if( Negative_Money_Flow > 471.066 )
					if( Negative_Money_Flow_Sum <= 855055 )
						if( Money_Flow_Ratio <= 7.82596 )
							if( Typical_Price <= 0.125669 )
								if( Positive_Money_Flow_Sum <= 95422.7 )
									ret := 0.261905
								if( Positive_Money_Flow_Sum > 95422.7 )
									ret := 0.020174
							if( Typical_Price > 0.125669 )
								if( smoothK_k <= 74.2778 )
									ret := 0.181067
								if( smoothK_k > 74.2778 )
									ret := 0.003590
						if( Money_Flow_Ratio > 7.82596 )
							if( Negative_Money_Flow_Sum <= 116610 )
								if( d_k <= 10.1755 )
									ret := -0.238806
								if( d_k > 10.1755 )
									ret := 0.727273 // buy
							if( Negative_Money_Flow_Sum > 116610 )
								if( Positive_Money_Flow_Sum <= 4.52891e+06 )
									ret := 0.600000
								if( Positive_Money_Flow_Sum > 4.52891e+06 )
									ret := -0.611111
					if( Negative_Money_Flow_Sum > 855055 )
						if( Typical_Price <= 0.132561 )
							if( Positive_Money_Flow_Sum <= 825718 )
								if( Typical_Price <= 0.122232 )
									ret := -0.128460
								if( Typical_Price > 0.122232 )
									ret := 0.024168
							if( Positive_Money_Flow_Sum > 825718 )
								if( Money_Flow_Ratio <= 2.95926 )
									ret := 0.013692
								if( Money_Flow_Ratio > 2.95926 )
									ret := -0.285714
						if( Typical_Price > 0.132561 )
							if( MFI <= 72.084 )
								if( d_k <= 0.008285 )
									ret := -0.013679
								if( d_k > 0.008285 )
									ret := 0.120345
							if( MFI > 72.084 )
								if( Raw_Money_Flow <= 285359 )
									ret := -0.058480
								if( Raw_Money_Flow > 285359 )
									ret := 0.663866
		if( Negative_Money_Flow_Sum > 9.15524e+06 )
			if( Typical_Price <= 0.104737 )
				if( Typical_Price <= 0.093981 )
					ret := -0.357143
				if( Typical_Price > 0.093981 )
					if( rsi1 <= 9.77647 )
						ret := 1.000000 // buy
					if( rsi1 > 9.77647 )
						ret := 0.608696
			if( Typical_Price > 0.104737 )
				if( Raw_Money_Flow <= 212394 )
					if( Negative_Money_Flow_Sum <= 1.04792e+07 )
						ret := 0.153846
					if( Negative_Money_Flow_Sum > 1.04792e+07 )
						if( Negative_Money_Flow_Sum <= 1.18123e+07 )
							ret := 0.954545 // buy
						if( Negative_Money_Flow_Sum > 1.18123e+07 )
							ret := 0.583333
				if( Raw_Money_Flow > 212394 )
					if( Negative_Money_Flow_Sum <= 1.30741e+07 )
						if( MFI_High <= -73.4689 )
							if( MFI_High <= -76.4902 )
								ret := -0.454545
							if( MFI_High > -76.4902 )
								if( Typical_Price <= 0.124106 )
									ret := -1.000000 // sell
								if( Typical_Price > 0.124106 )
									ret := -0.777778 // sell
						if( MFI_High > -73.4689 )
							if( d_k <= -2.22549 )
								if( d <= 62.3092 )
									ret := -0.660000
								if( d > 62.3092 )
									ret := 0.109091
							if( d_k > -2.22549 )
								if( MFI_High <= -64.5269 )
									ret := 0.413793
								if( MFI_High > -64.5269 )
									ret := -0.202532
					if( Negative_Money_Flow_Sum > 1.30741e+07 )
						if( Negative_Money_Flow <= 2.49113e+06 )
							if( MFI_Low <= -13.2684 )
								ret := 0.200000
							if( MFI_Low > -13.2684 )
								if( rsi1 <= 30.4061 )
									ret := -0.846154 // sell
								if( rsi1 > 30.4061 )
									ret := -0.528000
						if( Negative_Money_Flow > 2.49113e+06 )
							ret := 0.631579
	if( MFI > 90.349 )
		if( Positive_Money_Flow <= 322142 )
			if( d_k <= 3.59496 )
				if( Positive_Money_Flow_Sum <= 1.86248e+06 )
					if( Raw_Money_Flow <= 73058.8 )
						if( Positive_Money_Flow_Sum <= 995053 )
							if( Typical_Price <= 0.084999 )
								if( MFI_Low <= 73.4627 )
									ret := 0.070000
								if( MFI_Low > 73.4627 )
									ret := -0.437500
							if( Typical_Price > 0.084999 )
								if( rsi1 <= 72.4842 )
									ret := -0.187500
								if( rsi1 > 72.4842 )
									ret := 0.279070
						if( Positive_Money_Flow_Sum > 995053 )
							if( smoothD_d <= 75.4629 )
								if( k <= 75.1002 )
									ret := 0.421053
								if( k > 75.1002 )
									ret := 0.000000
							if( smoothD_d > 75.4629 )
								if( rsi1 <= 93.5788 )
									ret := -0.227679
								if( rsi1 > 93.5788 )
									ret := -0.710526 // sell
					if( Raw_Money_Flow > 73058.8 )
						if( MFI_Low <= 71.8869 )
							if( Positive_Money_Flow <= 75363.8 )
								if( Typical_Price <= 0.101248 )
									ret := 1.000000 // buy
								if( Typical_Price > 0.101248 )
									ret := 0.542857
							if( Positive_Money_Flow > 75363.8 )
								if( Positive_Money_Flow_Sum <= 1.53163e+06 )
									ret := -0.094340
								if( Positive_Money_Flow_Sum > 1.53163e+06 )
									ret := 0.353659
						if( MFI_Low > 71.8869 )
							if( Positive_Money_Flow <= 197872 )
								if( Positive_Money_Flow_Sum <= 1.32646e+06 )
									ret := 0.604938
								if( Positive_Money_Flow_Sum > 1.32646e+06 )
									ret := 0.273224
							if( Positive_Money_Flow > 197872 )
								if( smoothK_k <= 93.747 )
									ret := 0.387755
								if( smoothK_k > 93.747 )
									ret := -0.181818
				if( Positive_Money_Flow_Sum > 1.86248e+06 )
					if( Typical_Price <= 0.129217 )
						if( Negative_Money_Flow_Sum <= 364285 )
							if( Positive_Money_Flow_Sum <= 2.91101e+06 )
								if( Negative_Money_Flow_Sum <= 164306 )
									ret := -0.298913
								if( Negative_Money_Flow_Sum > 164306 )
									ret := 0.090000
							if( Positive_Money_Flow_Sum > 2.91101e+06 )
								if( d <= 98.523 )
									ret := -0.557292
								if( d > 98.523 )
									ret := -0.087719
						if( Negative_Money_Flow_Sum > 364285 )
							ret := 0.777778 // buy
					if( Typical_Price > 0.129217 )
						if( smoothK_k <= 78.2194 )
							if( Positive_Money_Flow_Sum <= 3.22842e+06 )
								if( d <= 42.2597 )
									ret := -1.000000 // sell
								if( d > 42.2597 )
									ret := -0.277778
							if( Positive_Money_Flow_Sum > 3.22842e+06 )
								if( Negative_Money_Flow_Sum <= 364733 )
									ret := 1.000000 // buy
								if( Negative_Money_Flow_Sum > 364733 )
									ret := 0.777778 // buy
						if( smoothK_k > 78.2194 )
							if( Typical_Price <= 0.138781 )
								if( MFI_Low <= 73.6143 )
									ret := 0.560976
								if( MFI_Low > 73.6143 )
									ret := -0.018182
							if( Typical_Price > 0.138781 )
								if( smoothK_k <= 95.4742 )
									ret := 0.050000
								if( smoothK_k > 95.4742 )
									ret := -0.615385
			if( d_k > 3.59496 )
				if( Negative_Money_Flow <= 296980 )
					if( Positive_Money_Flow_Sum <= 2.67278e+06 )
						if( Positive_Money_Flow_Sum <= 2.48813e+06 )
							if( Positive_Money_Flow <= 44805.3 )
								if( Positive_Money_Flow_Sum <= 1.21111e+06 )
									ret := 0.282051
								if( Positive_Money_Flow_Sum > 1.21111e+06 )
									ret := 0.635762
							if( Positive_Money_Flow > 44805.3 )
								if( Negative_Money_Flow_Sum <= 99340.3 )
									ret := 0.402174
								if( Negative_Money_Flow_Sum > 99340.3 )
									ret := -0.111111
						if( Positive_Money_Flow_Sum > 2.48813e+06 )
							if( Negative_Money_Flow <= 154326 )
								ret := -0.545455
							if( Negative_Money_Flow > 154326 )
								ret := -1.000000 // sell
					if( Positive_Money_Flow_Sum > 2.67278e+06 )
						if( Positive_Money_Flow_Sum <= 2.77158e+06 )
							if( Raw_Money_Flow <= 54349.4 )
								ret := 0.777778 // buy
							if( Raw_Money_Flow > 54349.4 )
								ret := 1.000000 // buy
						if( Positive_Money_Flow_Sum > 2.77158e+06 )
							if( Raw_Money_Flow <= 172418 )
								if( rsi1 <= 72.3356 )
									ret := 0.812500 // buy
								if( rsi1 > 72.3356 )
									ret := 0.151899
							if( Raw_Money_Flow > 172418 )
								if( Typical_Price <= 0.111443 )
									ret := 0.090909
								if( Typical_Price > 0.111443 )
									ret := 0.876404 // buy
				if( Negative_Money_Flow > 296980 )
					ret := -0.666667
		if( Positive_Money_Flow > 322142 )
			if( d <= 99.966 )
				if( Positive_Money_Flow_Sum <= 1.25294e+07 )
					if( rsi1 <= 95.8433 )
						if( Raw_Money_Flow <= 1.01306e+06 )
							if( Positive_Money_Flow_Sum <= 3.05902e+06 )
								if( Raw_Money_Flow <= 459452 )
									ret := 0.495968
								if( Raw_Money_Flow > 459452 )
									ret := 0.147887
							if( Positive_Money_Flow_Sum > 3.05902e+06 )
								if( MFI <= 91.982 )
									ret := 0.375000
								if( MFI > 91.982 )
									ret := 0.784615 // buy
						if( Raw_Money_Flow > 1.01306e+06 )
							if( Positive_Money_Flow <= 2.49809e+06 )
								if( Money_Flow_Ratio <= 16.4398 )
									ret := 0.347826
								if( Money_Flow_Ratio > 16.4398 )
									ret := -0.378788
							if( Positive_Money_Flow > 2.49809e+06 )
								if( k <= 84.006 )
									ret := 0.555556
								if( k > 84.006 )
									ret := -1.000000 // sell
					if( rsi1 > 95.8433 )
						if( k <= 98.7964 )
							ret := 1.000000 // buy
						if( k > 98.7964 )
							ret := 0.800000 // buy
				if( Positive_Money_Flow_Sum > 1.25294e+07 )
					ret := -0.826087 // sell
			if( d > 99.966 )
				if( rsi1 <= 92.5469 )
					if( Money_Flow_Ratio <= 14.8667 )
						ret := -0.500000
					if( Money_Flow_Ratio > 14.8667 )
						ret := -0.384615
				if( rsi1 > 92.5469 )
					ret := 0.285714
	
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
float op_operation = decision_tree_0_TRXUSDT_5Min_b9751cf0(Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow, d_k, d, rsi1, k, smoothD_d, smoothK_k)

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


