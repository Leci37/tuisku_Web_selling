//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: DOTUSDT_30Min_2CT0_6f475247 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_DOTUSDT_30Min_2CT0_6f475247", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_DOTUSDT_30Min_6f475247(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( ad <= -139106 )
		if( ad <= -468588 )
			if( ema12 <= 0.603866 )
				if( tema <= 8.49872 )
					if( mf <= 0.076335 )
						if( ema13 <= -0.117997 )
							if( ema3 <= 6.05694 )
								if( ad <= -608275 )
									ret := 0.882353 // buy
								if( ad > -608275 )
									ret := 0.500000
							if( ema3 > 6.05694 )
								ret := 1.000000 // buy
						if( ema13 > -0.117997 )
							if( ad_mf <= -481455 )
								if( ema12 <= -0.06546 )
									ret := 0.000000
								if( ema12 > -0.06546 )
									ret := 0.666667
							if( ad_mf > -481455 )
								ret := 1.000000 // buy
					if( mf > 0.076335 )
						if( ad <= -485039 )
							if( mf <= 0.191321 )
								if( ad_mf <= -636578 )
									ret := 1.000000 // buy
								if( ad_mf > -636578 )
									ret := 0.400000
							if( mf > 0.191321 )
								ret := 0.000000
						if( ad > -485039 )
							ret := -1.000000 // sell
				if( tema > 8.49872 )
					if( ad <= -906439 )
						if( ad_mf <= -1.20843e+06 )
							if( ema12 <= -0.615641 )
								if( ad_mf <= -1.61469e+06 )
									ret := 0.952381 // buy
								if( ad_mf > -1.61469e+06 )
									ret := 0.187500
							if( ema12 > -0.615641 )
								if( ema1 <= 17.311 )
									ret := 0.846154 // buy
								if( ema1 > 17.311 )
									ret := -1.000000 // sell
						if( ad_mf > -1.20843e+06 )
							if( ad_mf <= -1.16781e+06 )
								if( mf <= 0.040983 )
									ret := 0.850000 // buy
								if( mf > 0.040983 )
									ret := -0.333333
							if( ad_mf > -1.16781e+06 )
								if( mf <= 0.070621 )
									ret := 0.928571 // buy
								if( mf > 0.070621 )
									ret := 0.619048
					if( ad > -906439 )
						if( ad_mf <= -868837 )
							if( ema2 <= 27.4889 )
								if( ema2 <= 15.4235 )
									ret := 0.333333
								if( ema2 > 15.4235 )
									ret := -0.791667 // sell
							if( ema2 > 27.4889 )
								if( ema1 <= 29.8984 )
									ret := 1.000000 // buy
								if( ema1 > 29.8984 )
									ret := -0.125000
						if( ad_mf > -868837 )
							if( ad_mf <= -636864 )
								if( ad <= -711040 )
									ret := 0.384615
								if( ad > -711040 )
									ret := 0.646617
							if( ad_mf > -636864 )
								if( ad_mf <= -632914 )
									ret := -1.000000 // sell
								if( ad_mf > -632914 )
									ret := 0.313800
			if( ema12 > 0.603866 )
				if( ema13 <= 2.62003 )
					if( mf <= 0.198525 )
						if( ema13 <= 1.23101 )
							if( ema13 <= 0.974851 )
								ret := -1.000000 // sell
							if( ema13 > 0.974851 )
								ret := -0.428571
						if( ema13 > 1.23101 )
							if( ema2 <= 35.3459 )
								if( tema <= 30.7569 )
									ret := 0.400000
								if( tema > 30.7569 )
									ret := 1.000000 // buy
							if( ema2 > 35.3459 )
								ret := 0.000000
					if( mf > 0.198525 )
						if( ad_mf <= -636536 )
							ret := -1.000000 // sell
						if( ad_mf > -636536 )
							ret := -0.500000
				if( ema13 > 2.62003 )
					ret := 1.000000 // buy
		if( ad > -468588 )
			if( ad <= -146678 )
				if( ad <= -147721 )
					if( ad_mf <= -448671 )
						if( ema2 <= 15.8796 )
							if( ema1 <= 10.9518 )
								if( ema13 <= 0.171791 )
									ret := -0.333333
								if( ema13 > 0.171791 )
									ret := 0.750000 // buy
							if( ema1 > 10.9518 )
								if( ema2 <= 15.047 )
									ret := 1.000000 // buy
								if( ema2 > 15.047 )
									ret := 0.500000
						if( ema2 > 15.8796 )
							if( ema13 <= -1.30097 )
								ret := 1.000000 // buy
							if( ema13 > -1.30097 )
								if( ema13 <= 0.04109 )
									ret := -0.914286 // sell
								if( ema13 > 0.04109 )
									ret := -0.228571
					if( ad_mf > -448671 )
						if( ema12 <= -0.021459 )
							if( ema2 <= 33.1423 )
								if( ad <= -148106 )
									ret := 0.233861
								if( ad > -148106 )
									ret := -0.888889 // sell
							if( ema2 > 33.1423 )
								if( ad <= -290503 )
									ret := -0.179487
								if( ad > -290503 )
									ret := 0.134694
						if( ema12 > -0.021459 )
							if( ema13 <= -0.072814 )
								if( ema2 <= 12.2338 )
									ret := -0.894737 // sell
								if( ema2 > 12.2338 )
									ret := -0.404255
							if( ema13 > -0.072814 )
								if( ema2 <= 8.67222 )
									ret := 0.220310
								if( ema2 > 8.67222 )
									ret := 0.084092
				if( ad > -147721 )
					if( ema13 <= -0.577621 )
						ret := 1.000000 // buy
					if( ema13 > -0.577621 )
						if( mf <= 0.132222 )
							if( mf <= -0.08101 )
								if( ad <= -147566 )
									ret := 0.600000
								if( ad > -147566 )
									ret := -0.500000
							if( mf > -0.08101 )
								if( tema <= 10.614 )
									ret := -0.400000
								if( tema > 10.614 )
									ret := -0.909091 // sell
						if( mf > 0.132222 )
							if( ema2 <= 8.43652 )
								ret := -0.200000
							if( ema2 > 8.43652 )
								ret := 0.750000 // buy
			if( ad > -146678 )
				if( ad <= -144702 )
					if( mf <= 0.110605 )
						if( ema12 <= -0.131597 )
							if( ema2 <= 29.2666 )
								ret := 1.000000 // buy
							if( ema2 > 29.2666 )
								ret := 0.750000 // buy
						if( ema12 > -0.131597 )
							if( ad <= -146505 )
								if( ema2 <= 26.8339 )
									ret := -0.375000
								if( ema2 > 26.8339 )
									ret := 1.000000 // buy
							if( ad > -146505 )
								if( ema2 <= 21.8767 )
									ret := 0.621622
								if( ema2 > 21.8767 )
									ret := 0.861111 // buy
					if( mf > 0.110605 )
						if( ema3 <= 30.8073 )
							if( ema12 <= 0.036877 )
								if( ema13 <= 0.046616 )
									ret := 0.000000
								if( ema13 > 0.046616 )
									ret := -0.750000 // sell
							if( ema12 > 0.036877 )
								if( ema1 <= 13.1508 )
									ret := 0.250000
								if( ema1 > 13.1508 )
									ret := 0.727273 // buy
						if( ema3 > 30.8073 )
							if( ad <= -145617 )
								ret := -0.800000 // sell
							if( ad > -145617 )
								ret := -0.285714
				if( ad > -144702 )
					if( ad_mf <= -144213 )
						if( ema2 <= 17.1702 )
							if( ad <= -144555 )
								ret := 0.000000
							if( ad > -144555 )
								ret := -0.857143 // sell
						if( ema2 > 17.1702 )
							if( ema2 <= 22.3825 )
								ret := -1.000000 // sell
							if( ema2 > 22.3825 )
								ret := -0.500000
					if( ad_mf > -144213 )
						if( mf <= 0.11969 )
							if( ema13 <= -0.03208 )
								if( ad_mf <= -140308 )
									ret := 0.335766
								if( ad_mf > -140308 )
									ret := 0.804878 // buy
							if( ema13 > -0.03208 )
								if( ema12 <= 0.203974 )
									ret := 0.063492
								if( ema12 > 0.203974 )
									ret := -0.625000
						if( mf > 0.11969 )
							if( ema3 <= 11.291 )
								if( ema12 <= 0.087376 )
									ret := -0.181818
								if( ema12 > 0.087376 )
									ret := 0.600000
							if( ema3 > 11.291 )
								if( mf <= 0.13974 )
									ret := 0.941176 // buy
								if( mf > 0.13974 )
									ret := 0.583333
	if( ad > -139106 )
		if( ema13 <= -0.065495 )
			if( ad_mf <= -60737.2 )
				if( mf <= -0.12914 )
					if( tema <= 8.80465 )
						if( ad_mf <= -83065.7 )
							if( ad_mf <= -93344.6 )
								if( ema3 <= 8.61022 )
									ret := 0.083333
								if( ema3 > 8.61022 )
									ret := 0.866667 // buy
							if( ad_mf > -93344.6 )
								if( mf <= -0.189969 )
									ret := 0.913043 // buy
								if( mf > -0.189969 )
									ret := 0.562500
						if( ad_mf > -83065.7 )
							if( ad_mf <= -81171.1 )
								if( mf <= -0.193763 )
									ret := -1.000000 // sell
								if( mf > -0.193763 )
									ret := -0.500000
							if( ad_mf > -81171.1 )
								if( ad_mf <= -61865.2 )
									ret := 0.056338
								if( ad_mf > -61865.2 )
									ret := -0.777778 // sell
					if( tema > 8.80465 )
						if( ema13 <= -0.11979 )
							if( ad <= -64430.7 )
								if( ad_mf <= -79988.2 )
									ret := 0.104110
								if( ad_mf > -79988.2 )
									ret := -0.319149
							if( ad > -64430.7 )
								if( mf <= -0.19184 )
									ret := 0.000000
								if( mf > -0.19184 )
									ret := 0.692308
						if( ema13 > -0.11979 )
							if( ad <= -86071 )
								if( ema1 <= 9.70323 )
									ret := 0.000000
								if( ema1 > 9.70323 )
									ret := -0.564516
							if( ad > -86071 )
								if( ad_mf <= -79732.5 )
									ret := 0.666667
								if( ad_mf > -79732.5 )
									ret := -0.200000
				if( mf > -0.12914 )
					if( ema1 <= 32.7401 )
						if( mf <= 0.009214 )
							if( ad_mf <= -61200.5 )
								if( ad_mf <= -108656 )
									ret := 0.335958
								if( ad_mf > -108656 )
									ret := 0.156129
							if( ad_mf > -61200.5 )
								if( ema3 <= 19.3646 )
									ret := 0.500000
								if( ema3 > 19.3646 )
									ret := 0.933333 // buy
						if( mf > 0.009214 )
							if( ad_mf <= -138167 )
								ret := -0.833333 // sell
							if( ad_mf > -138167 )
								if( ad_mf <= -131279 )
									ret := 0.791667 // buy
								if( ad_mf > -131279 )
									ret := 0.395161
					if( ema1 > 32.7401 )
						if( ema12 <= -0.195893 )
							if( ema1 <= 38.9194 )
								if( ema2 <= 37.5887 )
									ret := 0.376812
								if( ema2 > 37.5887 )
									ret := 0.882353 // buy
							if( ema1 > 38.9194 )
								if( ema2 <= 39.5174 )
									ret := -0.750000 // sell
								if( ema2 > 39.5174 )
									ret := 0.223404
						if( ema12 > -0.195893 )
							if( mf <= 0.190795 )
								if( ema13 <= -0.54794 )
									ret := -0.857143 // sell
								if( ema13 > -0.54794 )
									ret := -0.032000
							if( mf > 0.190795 )
								ret := 1.000000 // buy
			if( ad_mf > -60737.2 )
				if( ad <= 579356 )
					if( ema2 <= 7.30804 )
						if( ad_mf <= 152787 )
							if( ema3 <= 3.84894 )
								ret := 1.000000 // buy
							if( ema3 > 3.84894 )
								if( ad_mf <= 121179 )
									ret := 0.126260
								if( ad_mf > 121179 )
									ret := 0.416667
						if( ad_mf > 152787 )
							if( mf <= -0.131402 )
								if( ad_mf <= 280016 )
									ret := 0.244444
								if( ad_mf > 280016 )
									ret := 0.687500
							if( mf > -0.131402 )
								if( tema <= 3.89669 )
									ret := 0.833333 // buy
								if( tema > 3.89669 )
									ret := -0.191667
					if( ema2 > 7.30804 )
						if( ad_mf <= 486350 )
							if( ad <= 474123 )
								if( mf <= -0.071476 )
									ret := -0.018933
								if( mf > -0.071476 )
									ret := 0.044744
							if( ad > 474123 )
								ret := 1.000000 // buy
						if( ad_mf > 486350 )
							if( ad_mf <= 516298 )
								if( ema3 <= 37.8804 )
									ret := -0.918919 // sell
								if( ema3 > 37.8804 )
									ret := -0.200000
							if( ad_mf > 516298 )
								if( ad_mf <= 520160 )
									ret := 1.000000 // buy
								if( ad_mf > 520160 )
									ret := -0.148148
				if( ad > 579356 )
					if( ad_mf <= 625107 )
						if( ad <= 603718 )
							if( ema13 <= -0.593588 )
								if( ema2 <= 37.2053 )
									ret := 0.923077 // buy
								if( ema2 > 37.2053 )
									ret := 0.500000
							if( ema13 > -0.593588 )
								if( ema12 <= -0.083366 )
									ret := -0.071429
								if( ema12 > -0.083366 )
									ret := 0.857143 // buy
						if( ad > 603718 )
							ret := 1.000000 // buy
					if( ad_mf > 625107 )
						if( ad <= 651512 )
							if( ema13 <= -0.279319 )
								if( tema <= 21.4166 )
									ret := -0.875000 // sell
								if( tema > 21.4166 )
									ret := -0.250000
							if( ema13 > -0.279319 )
								if( ema1 <= 12.5698 )
									ret := -0.250000
								if( ema1 > 12.5698 )
									ret := 0.000000
						if( ad > 651512 )
							if( ema1 <= 42.7832 )
								if( ema13 <= -0.18266 )
									ret := 0.350299
								if( ema13 > -0.18266 )
									ret := -0.058824
							if( ema1 > 42.7832 )
								ret := -1.000000 // sell
		if( ema13 > -0.065495 )
			if( tema <= 37.4522 )
				if( ema12 <= 0.614766 )
					if( ad_mf <= -33394.8 )
						if( ad_mf <= -75973.1 )
							if( ad_mf <= -76279 )
								if( ad_mf <= -128423 )
									ret := -0.102400
								if( ad_mf > -128423 )
									ret := 0.007950
							if( ad_mf > -76279 )
								if( ema13 <= -0.01311 )
									ret := 0.375000
								if( ema13 > -0.01311 )
									ret := -0.633333
						if( ad_mf > -75973.1 )
							if( ad <= -75659.2 )
								if( ema3 <= 10.728 )
									ret := 0.619048
								if( ema3 > 10.728 )
									ret := -0.200000
							if( ad > -75659.2 )
								if( ema1 <= 31.1759 )
									ret := 0.081989
								if( ema1 > 31.1759 )
									ret := 0.215488
					if( ad_mf > -33394.8 )
						if( ad_mf <= -31599.7 )
							if( ad <= -31746.9 )
								if( ema3 <= 9.53695 )
									ret := -0.046703
								if( ema3 > 9.53695 )
									ret := -0.296610
							if( ad > -31746.9 )
								if( ema13 <= -0.018024 )
									ret := -0.333333
								if( ema13 > -0.018024 )
									ret := -0.755556 // sell
						if( ad_mf > -31599.7 )
							if( ad <= 547714 )
								if( ad_mf <= 474502 )
									ret := 0.014260
								if( ad_mf > 474502 )
									ret := -0.262673
							if( ad > 547714 )
								if( ad <= 754131 )
									ret := 0.340491
								if( ad > 754131 )
									ret := -0.014245
				if( ema12 > 0.614766 )
					if( ad <= 426484 )
						if( tema <= 26.8085 )
							if( ema12 <= 0.678877 )
								ret := 0.500000
							if( ema12 > 0.678877 )
								ret := 1.000000 // buy
						if( tema > 26.8085 )
							if( ema13 <= 1.89468 )
								if( ema3 <= 32.1613 )
									ret := -0.466667
								if( ema3 > 32.1613 )
									ret := 0.000000
							if( ema13 > 1.89468 )
								ret := 1.000000 // buy
					if( ad > 426484 )
						if( ema12 <= 0.883888 )
							if( mf <= 0.211038 )
								if( ad_mf <= 512608 )
									ret := -0.500000
								if( ad_mf > 512608 )
									ret := -0.958333 // sell
							if( mf > 0.211038 )
								if( mf <= 0.280826 )
									ret := -0.300000
								if( mf > 0.280826 )
									ret := -0.916667 // sell
						if( ema12 > 0.883888 )
							ret := 0.000000
			if( tema > 37.4522 )
				if( ad_mf <= -125461 )
					if( ad <= -128582 )
						if( ema2 <= 40.7893 )
							if( mf <= 0.07579 )
								ret := -1.000000 // sell
							if( mf > 0.07579 )
								ret := -0.200000
						if( ema2 > 40.7893 )
							if( ema13 <= 1.08033 )
								if( ema13 <= 0.42789 )
									ret := 0.400000
								if( ema13 > 0.42789 )
									ret := -0.500000
							if( ema13 > 1.08033 )
								ret := 1.000000 // buy
					if( ad > -128582 )
						if( ema13 <= 0.270483 )
							if( ema13 <= 0.092438 )
								ret := 0.600000
							if( ema13 > 0.092438 )
								ret := 1.000000 // buy
						if( ema13 > 0.270483 )
							if( ema1 <= 41.176 )
								ret := 0.250000
							if( ema1 > 41.176 )
								ret := 0.666667
				if( ad_mf > -125461 )
					if( mf <= 0.256389 )
						if( ema2 <= 36.6968 )
							if( ema3 <= 35.2363 )
								ret := -0.500000
							if( ema3 > 35.2363 )
								if( ad <= 171994 )
									ret := -0.600000
								if( ad > 171994 )
									ret := -1.000000 // sell
						if( ema2 > 36.6968 )
							if( ad_mf <= -68850.7 )
								if( ema12 <= -0.025082 )
									ret := 0.142857
								if( ema12 > -0.025082 )
									ret := -0.311284
							if( ad_mf > -68850.7 )
								if( ema12 <= 0.746204 )
									ret := -0.055094
								if( ema12 > 0.746204 )
									ret := 0.416667
					if( mf > 0.256389 )
						if( ema1 <= 37.321 )
							if( ema2 <= 36.4811 )
								ret := 0.750000 // buy
							if( ema2 > 36.4811 )
								ret := -0.500000
						if( ema1 > 37.321 )
							if( ema3 <= 39.9496 )
								if( ema3 <= 36.9512 )
									ret := -0.384615
								if( ema3 > 36.9512 )
									ret := -0.805556 // sell
							if( ema3 > 39.9496 )
								if( tema <= 45.0246 )
									ret := -0.223881
								if( tema > 45.0246 )
									ret := -0.633333
	
    ret //return
// Define expected timeframe based on the selected interval: 30Min pine_value: 30   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  30MIN !!"
if (str.tostring(timeframe.period) != "30")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_Chaikin_Money_Flow 
 //@version=5
//indicator title="Chaikin Money Flow", shorttitle="CMF", format=format.price, precision=2, timeframe="", timeframe_gaps=true)
var cumVol = 0.
cumVol += nz(volume)
if barstate.islast and cumVol == 0
    runtime.error("No volume is provided by the data vendor.")
length_CMF = input.int(20, minval=1)
ad = close==high and close==low or high==low ? 0 : ((2*close-low-high)/(high-low))*volume
mf = math.sum(ad, length_CMF) / math.sum(volume, length_CMF)
plot(mf, color=#43A047, title="MF")
hline(0, color=#787B86, title="Zero", linestyle=hline.style_dashed)


ad_mf = ad - mf

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
float op_operation = decision_tree_0_DOTUSDT_30Min_6f475247(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)

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


