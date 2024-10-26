//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Bull_Bear_Power, L_Triple_EMA
// ID_model: HUBS_15Min_2BT0_8e8ca204 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_HUBS_15Min_2BT0_8e8ca204", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_HUBS_15Min_8e8ca204(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ema3 <= 284.33 )
		if( tema <= 243.322 )
			if( bearPower <= -4.62231 )
				if( bbm <= 0.496406 )
					if( ema2 <= 182.147 )
						if( bbm <= 0.257432 )
							ret := 1.000000 // buy
						if( bbm > 0.257432 )
							ret := 0.636364
					if( ema2 > 182.147 )
						ret := 0.583333
				if( bbm > 0.496406 )
					if( ema13 <= -4.33523 )
						if( ema3 <= 104.177 )
							ret := 1.000000 // buy
						if( ema3 > 104.177 )
							if( bullPower <= -5.97785 )
								ret := 0.600000
							if( bullPower > -5.97785 )
								if( ema2 <= 111.714 )
									ret := -1.000000 // sell
								if( ema2 > 111.714 )
									ret := -0.006250
					if( ema13 > -4.33523 )
						if( bearPower <= -5.41906 )
							if( ema2 <= 118.011 )
								ret := -0.214286
							if( ema2 > 118.011 )
								if( ema1 <= 183.645 )
									ret := 0.676923
								if( ema1 > 183.645 )
									ret := 0.298507
						if( bearPower > -5.41906 )
							if( bearPower <= -4.67774 )
								if( ema1 <= 171.64 )
									ret := -0.084112
								if( ema1 > 171.64 )
									ret := 0.324324
							if( bearPower > -4.67774 )
								ret := 0.952381 // buy
			if( bearPower > -4.62231 )
				if( ema2 <= 133.085 )
					if( bearPower <= -2.20968 )
						if( ema13 <= 0.444978 )
							if( bullPower <= -1.03301 )
								if( ema1 <= 127.565 )
									ret := 0.454286
								if( ema1 > 127.565 )
									ret := 0.000000
							if( bullPower > -1.03301 )
								if( ema13 <= -2.66349 )
									ret := -0.804878 // sell
								if( ema13 > -2.66349 )
									ret := 0.178082
						if( ema13 > 0.444978 )
							ret := 1.000000 // buy
					if( bearPower > -2.20968 )
						if( ema13 <= -2.64161 )
							if( bbm <= 0.828723 )
								if( ema2 <= 119.317 )
									ret := -1.000000 // sell
								if( ema2 > 119.317 )
									ret := -0.727273 // sell
							if( bbm > 0.828723 )
								ret := -0.333333
						if( ema13 > -2.64161 )
							if( bbp <= -2.38036 )
								if( ema12 <= -1.14212 )
									ret := 0.394366
								if( ema12 > -1.14212 )
									ret := -0.271226
							if( bbp > -2.38036 )
								if( ema3 <= 132.083 )
									ret := 0.045841
								if( ema3 > 132.083 )
									ret := 0.392638
				if( ema2 > 133.085 )
					if( ema13 <= -4.96099 )
						if( bullPower <= -2.23055 )
							ret := -0.666667
						if( bullPower > -2.23055 )
							if( bbp <= -5.28845 )
								ret := -0.888889 // sell
							if( bbp > -5.28845 )
								ret := -1.000000 // sell
					if( ema13 > -4.96099 )
						if( tema <= 133.763 )
							if( ema3 <= 135.932 )
								if( ema1 <= 132.924 )
									ret := -0.918033 // sell
								if( ema1 > 132.924 )
									ret := -0.380567
							if( ema3 > 135.932 )
								if( bbm <= 1.67011 )
									ret := 0.459459
								if( bbm > 1.67011 )
									ret := -0.300000
						if( tema > 133.763 )
							if( tema <= 232.262 )
								if( bbp <= 10.1264 )
									ret := -0.007155
								if( bbp > 10.1264 )
									ret := 0.595238
							if( tema > 232.262 )
								if( bbm <= 0.431899 )
									ret := 0.437500
								if( bbm > 0.431899 )
									ret := -0.336735
		if( tema > 243.322 )
			if( bullPower <= 4.03163 )
				if( ema2 <= 260.804 )
					if( tema <= 256.699 )
						if( ema1 <= 256.501 )
							if( ema3 <= 254.355 )
								ret := 0.846154 // buy
							if( ema3 > 254.355 )
								ret := 1.000000 // buy
						if( ema1 > 256.501 )
							if( bbp <= -3.5691 )
								if( ema12 <= -2.66115 )
									ret := 0.714286 // buy
								if( ema12 > -2.66115 )
									ret := 1.000000 // buy
							if( bbp > -3.5691 )
								ret := 0.000000
					if( tema > 256.699 )
						if( ema2 <= 259.863 )
							if( ema2 <= 257.985 )
								if( ema1 <= 258.369 )
									ret := 0.411765
								if( ema1 > 258.369 )
									ret := 1.000000 // buy
							if( ema2 > 257.985 )
								if( ema3 <= 258.143 )
									ret := -0.866667 // sell
								if( ema3 > 258.143 )
									ret := -0.111111
						if( ema2 > 259.863 )
							if( ema1 <= 259.92 )
								ret := 1.000000 // buy
							if( ema1 > 259.92 )
								if( ema12 <= 1.70111 )
									ret := 0.222222
								if( ema12 > 1.70111 )
									ret := 1.000000 // buy
				if( ema2 > 260.804 )
					if( bbp <= -9.60289 )
						if( ema1 <= 271.635 )
							if( ema3 <= 279.258 )
								if( bearPower <= -8.75966 )
									ret := 0.166667
								if( bearPower > -8.75966 )
									ret := 0.885714 // buy
							if( ema3 > 279.258 )
								ret := -1.000000 // sell
						if( ema1 > 271.635 )
							if( bbp <= -10.4296 )
								if( ema1 <= 273.122 )
									ret := 1.000000 // buy
								if( ema1 > 273.122 )
									ret := 0.796875 // buy
							if( bbp > -10.4296 )
								ret := 0.312500
					if( bbp > -9.60289 )
						if( ema13 <= 3.73226 )
							if( ema1 <= 282.115 )
								if( ema2 <= 279.985 )
									ret := 0.112477
								if( ema2 > 279.985 )
									ret := -0.253823
							if( ema1 > 282.115 )
								if( ema12 <= 1.79538 )
									ret := 0.446494
								if( ema12 > 1.79538 )
									ret := -0.909091 // sell
						if( ema13 > 3.73226 )
							if( bullPower <= 2.12278 )
								ret := -0.214286
							if( bullPower > 2.12278 )
								if( ema3 <= 272.936 )
									ret := 0.942857 // buy
								if( ema3 > 272.936 )
									ret := 0.760563 // buy
			if( bullPower > 4.03163 )
				if( ema1 <= 277.274 )
					if( ema13 <= 1.98552 )
						if( ema12 <= 1.16956 )
							if( ema1 <= 274.374 )
								if( bbp <= 5.87712 )
									ret := 0.173913
								if( bbp > 5.87712 )
									ret := 0.666667
							if( ema1 > 274.374 )
								if( bbp <= 5.07124 )
									ret := 0.733333 // buy
								if( bbp > 5.07124 )
									ret := -0.913043 // sell
						if( ema12 > 1.16956 )
							if( bbp <= 10.6871 )
								if( bbm <= 2.7616 )
									ret := -0.714286 // sell
								if( bbm > 2.7616 )
									ret := -0.941176 // sell
							if( bbp > 10.6871 )
								ret := -0.083333
					if( ema13 > 1.98552 )
						if( bbp <= 6.67661 )
							if( ema13 <= 3.51756 )
								ret := 0.647059
							if( ema13 > 3.51756 )
								ret := 0.909091 // buy
						if( bbp > 6.67661 )
							if( bearPower <= 3.43898 )
								if( ema3 <= 257.806 )
									ret := -0.888889 // sell
								if( ema3 > 257.806 )
									ret := 0.021277
							if( bearPower > 3.43898 )
								if( ema12 <= 6.58884 )
									ret := 0.460317
								if( ema12 > 6.58884 )
									ret := -0.600000
				if( ema1 > 277.274 )
					if( ema2 <= 277.513 )
						if( bearPower <= 0.991998 )
							ret := 0.133333
						if( bearPower > 0.991998 )
							if( bullPower <= 5.47708 )
								if( tema <= 281.514 )
									ret := -0.827586 // sell
								if( tema > 281.514 )
									ret := -0.974359 // sell
							if( bullPower > 5.47708 )
								if( ema2 <= 274.76 )
									ret := -0.722222 // sell
								if( ema2 > 274.76 )
									ret := -0.133333
					if( ema2 > 277.513 )
						if( ema2 <= 283.036 )
							if( ema12 <= 2.18319 )
								if( ema1 <= 282.954 )
									ret := -0.666667
								if( ema1 > 282.954 )
									ret := 0.333333
							if( ema12 > 2.18319 )
								if( bullPower <= 5.36879 )
									ret := 0.911765 // buy
								if( bullPower > 5.36879 )
									ret := 0.567568
						if( ema2 > 283.036 )
							if( bullPower <= 10.8706 )
								if( bbp <= 8.31846 )
									ret := 0.269231
								if( bbp > 8.31846 )
									ret := -0.857143 // sell
							if( bullPower > 10.8706 )
								ret := 1.000000 // buy
	if( ema3 > 284.33 )
		if( ema13 <= -11.8546 )
			if( bbm <= 5.10659 )
				if( ema12 <= -5.70034 )
					if( ema2 <= 757.823 )
						if( bearPower <= -12.3169 )
							if( ema12 <= -10.0332 )
								if( ema13 <= -21.8707 )
									ret := -0.055556
								if( ema13 > -21.8707 )
									ret := 0.938776 // buy
							if( ema12 > -10.0332 )
								if( ema2 <= 410.598 )
									ret := -0.800000 // sell
								if( ema2 > 410.598 )
									ret := 0.312500
						if( bearPower > -12.3169 )
							if( bbm <= 3.05114 )
								if( ema1 <= 486.304 )
									ret := 0.733333 // buy
								if( ema1 > 486.304 )
									ret := 0.181818
							if( bbm > 3.05114 )
								if( ema1 <= 636.56 )
									ret := 0.839623 // buy
								if( ema1 > 636.56 )
									ret := 0.100000
					if( ema2 > 757.823 )
						ret := -0.400000
				if( ema12 > -5.70034 )
					if( ema13 <= -13.1257 )
						ret := 0.600000
					if( ema13 > -13.1257 )
						if( bbp <= -12.7923 )
							ret := -0.857143 // sell
						if( bbp > -12.7923 )
							ret := -0.166667
			if( bbm > 5.10659 )
				if( bbm <= 6.56294 )
					if( ema13 <= -12.3818 )
						if( ema1 <= 494.327 )
							if( bearPower <= -11.8755 )
								if( ema13 <= -15.1172 )
									ret := 0.000000
								if( ema13 > -15.1172 )
									ret := -0.650000
							if( bearPower > -11.8755 )
								ret := -1.000000 // sell
						if( ema1 > 494.327 )
							if( ema2 <= 567.178 )
								ret := 1.000000 // buy
							if( ema2 > 567.178 )
								if( bbm <= 5.7225 )
									ret := 0.074074
								if( bbm > 5.7225 )
									ret := -0.684211
					if( ema13 > -12.3818 )
						ret := 0.400000
				if( bbm > 6.56294 )
					if( ema2 <= 471.673 )
						if( ema1 <= 434.934 )
							ret := 0.533333
						if( ema1 > 434.934 )
							if( bullPower <= -11.1747 )
								ret := 0.545455
							if( bullPower > -11.1747 )
								ret := 1.000000 // buy
					if( ema2 > 471.673 )
						if( bullPower <= -7.08017 )
							if( ema12 <= -15.321 )
								if( bullPower <= -18.9866 )
									ret := 0.545455
								if( bullPower > -18.9866 )
									ret := 1.000000 // buy
							if( ema12 > -15.321 )
								if( bbp <= -30.3971 )
									ret := -0.328767
								if( bbp > -30.3971 )
									ret := 0.159091
						if( bullPower > -7.08017 )
							if( bbp <= -11.4389 )
								if( tema <= 710.192 )
									ret := 0.862069 // buy
								if( tema > 710.192 )
									ret := -0.125000
							if( bbp > -11.4389 )
								ret := -0.100000
		if( ema13 > -11.8546 )
			if( bullPower <= -2.62232 )
				if( bbm <= 1.27835 )
					if( ema2 <= 297.162 )
						if( ema1 <= 281.599 )
							ret := 0.000000
						if( ema1 > 281.599 )
							if( ema12 <= -1.86135 )
								if( ema12 <= -2.5236 )
									ret := -1.000000 // sell
								if( ema12 > -2.5236 )
									ret := -0.750000 // sell
							if( ema12 > -1.86135 )
								ret := -0.153846
					if( ema2 > 297.162 )
						if( ema3 <= 794.181 )
							if( ema2 <= 605.335 )
								if( ema12 <= -3.89337 )
									ret := -0.246914
								if( ema12 > -3.89337 )
									ret := 0.247387
							if( ema2 > 605.335 )
								if( bullPower <= -9.65945 )
									ret := 0.947368 // buy
								if( bullPower > -9.65945 )
									ret := -0.260274
						if( ema3 > 794.181 )
							if( ema3 <= 815.589 )
								ret := 1.000000 // buy
							if( ema3 > 815.589 )
								ret := 0.818182 // buy
				if( bbm > 1.27835 )
					if( ema1 <= 446.092 )
						if( ema13 <= -2.36009 )
							if( ema3 <= 447.92 )
								if( bbm <= 4.94691 )
									ret := -0.314985
								if( bbm > 4.94691 )
									ret := 0.069959
							if( ema3 > 447.92 )
								if( ema13 <= -9.3516 )
									ret := -0.857143 // sell
								if( ema13 > -9.3516 )
									ret := -0.978723 // sell
						if( ema13 > -2.36009 )
							if( ema2 <= 373.569 )
								if( bbm <= 4.52 )
									ret := 0.423077
								if( bbm > 4.52 )
									ret := 0.888889 // buy
							if( ema2 > 373.569 )
								ret := -0.473684
					if( ema1 > 446.092 )
						if( ema2 <= 461.013 )
							if( bbm <= 4.97718 )
								if( bbp <= -16.9456 )
									ret := 0.071429
								if( bbp > -16.9456 )
									ret := 0.699029
							if( bbm > 4.97718 )
								ret := -0.454545
						if( ema2 > 461.013 )
							if( ema3 <= 481.404 )
								if( bearPower <= -14.1564 )
									ret := -1.000000 // sell
								if( bearPower > -14.1564 )
									ret := -0.406393
							if( ema3 > 481.404 )
								if( tema <= 473.256 )
									ret := 0.635514
								if( tema > 473.256 )
									ret := -0.142506
			if( bullPower > -2.62232 )
				if( ema12 <= 1.48927 )
					if( ema13 <= -5.47434 )
						if( bbp <= 8.56194 )
							if( ema2 <= 645.035 )
								if( tema <= 513.072 )
									ret := -0.151819
								if( tema > 513.072 )
									ret := -0.517123
							if( ema2 > 645.035 )
								if( ema1 <= 755.65 )
									ret := 0.463918
								if( ema1 > 755.65 )
									ret := -0.560000
						if( bbp > 8.56194 )
							ret := 0.842105 // buy
					if( ema13 > -5.47434 )
						if( bullPower <= -1.08801 )
							if( ema1 <= 476.188 )
								if( ema1 <= 287.142 )
									ret := -0.397260
								if( ema1 > 287.142 )
									ret := 0.177982
							if( ema1 > 476.188 )
								if( ema1 <= 480.669 )
									ret := -0.693878
								if( ema1 > 480.669 )
									ret := 0.008000
						if( bullPower > -1.08801 )
							if( ema3 <= 407.048 )
								if( ema3 <= 403.843 )
									ret := -0.040201
								if( ema3 > 403.843 )
									ret := -0.480000
							if( ema3 > 407.048 )
								if( tema <= 419.252 )
									ret := 0.267537
								if( tema > 419.252 )
									ret := 0.001906
				if( ema12 > 1.48927 )
					if( tema <= 461.585 )
						if( bullPower <= 13.9079 )
							if( tema <= 439.907 )
								if( ema1 <= 315.429 )
									ret := -0.251506
								if( ema1 > 315.429 )
									ret := -0.042625
							if( tema > 439.907 )
								if( BBPower_Color <= 0.5 )
									ret := -0.681818
								if( BBPower_Color > 0.5 )
									ret := 0.255814
						if( bullPower > 13.9079 )
							if( ema3 <= 324.646 )
								if( ema12 <= 5.13226 )
									ret := 0.166667
								if( ema12 > 5.13226 )
									ret := 0.895522 // buy
							if( ema3 > 324.646 )
								if( ema1 <= 348.538 )
									ret := -0.733333 // sell
								if( ema1 > 348.538 )
									ret := 0.232227
					if( tema > 461.585 )
						if( ema1 <= 463.959 )
							if( bbm <= 12.5749 )
								if( bullPower <= 28.7792 )
									ret := -0.725225 // sell
								if( bullPower > 28.7792 )
									ret := 0.636364
							if( bbm > 12.5749 )
								if( ema1 <= 457.837 )
									ret := 0.384615
								if( ema1 > 457.837 )
									ret := 0.636364
						if( ema1 > 463.959 )
							if( ema2 <= 487.667 )
								if( bearPower <= 16.1211 )
									ret := 0.028186
								if( bearPower > 16.1211 )
									ret := 0.833333 // buy
							if( ema2 > 487.667 )
								if( bbm <= 0.00623 )
									ret := -0.476780
								if( bbm > 0.00623 )
									ret := -0.107012
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Bull_Bear_Power 
//@version=5
//indicator "Bull Bear Power", shorttitle="BBP")
lengthInput = input.int(13, title="Length")
bullPower = high - ta.ema(close, lengthInput)
bearPower = low - ta.ema(close, lengthInput)
bbp = bullPower + bearPower

bbm = bullPower - bearPower

plot(bbp, color = bbp >= 0 ? #089981 : #f23645, title="BBPower", style = plot.style_columns)
hline(0, "Zero line")

BBPower_Color = bbp >= 0  ? 1: 0


//CODE associated with the technical indicator L_Triple_EMA 
//@version=5
//indicator title="Triple EMA", shorttitle="TEMA", overlay=true, timeframe="", timeframe_gaps=true)
length_TEMA = input.int(9, minval=1)
ema1 = ta.ema(close, length_TEMA)
ema2 = ta.ema(ema1, length_TEMA)
ema3 = ta.ema(ema2, length_TEMA)
tema = 3 * (ema1 - ema2) + ema3
plot(tema, "TEMA", color=#2962FF)

ema12 = ema1 - ema2
ema13 = ema1 - ema3


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
float op_operation = decision_tree_0_HUBS_15Min_8e8ca204(bearPower, bbm, bbp, bullPower, BBPower_Color, ema12, ema3, ema13, tema, ema1, ema2)

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


