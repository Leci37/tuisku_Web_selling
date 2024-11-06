//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Triple_EMA
// ID_model: PYPL_1Min_2CT0_341810c5 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_PYPL_1Min_2CT0_341810c5", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_PYPL_1Min_341810c5(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)=>
	var float ret = 0  // # DecisionTreeRegressor(max_depth=8, max_features=sqrt, min_samples_leaf=7,min_samples_split=5, random_state=843828734)
	if( ad <= 5.97307 )
		if( ad <= -6032.94 )
			if( ad_mf <= -13477.3 )
				if( ema12 <= 0.097081 )
					if( ad <= -13499.3 )
						if( ema2 <= 71.1456 )
							if( ema1 <= 64.212 )
								if( ad_mf <= -23355 )
									ret := 0.171784
								if( ad_mf > -23355 )
									ret := -0.003868
							if( ema1 > 64.212 )
								if( ad_mf <= -14264.9 )
									ret := -0.044491
								if( ad_mf > -14264.9 )
									ret := 0.272059
						if( ema2 > 71.1456 )
							if( ad <= -23401 )
								if( ad_mf <= -95497.1 )
									ret := 0.518182
								if( ad_mf > -95497.1 )
									ret := -0.046711
							if( ad > -23401 )
								if( ad <= -23096.2 )
									ret := 0.906250 // buy
								if( ad > -23096.2 )
									ret := 0.217323
					if( ad > -13499.3 )
						if( ema2 <= 63.786 )
							ret := 0.500000
						if( ema2 > 63.786 )
							if( ema3 <= 68.1968 )
								ret := 1.000000 // buy
							if( ema3 > 68.1968 )
								ret := 0.833333 // buy
				if( ema12 > 0.097081 )
					if( ema3 <= 76.8772 )
						if( ad <= -25907.2 )
							if( ad_mf <= -28604.7 )
								if( tema <= 68.8175 )
									ret := 0.045977
								if( tema > 68.8175 )
									ret := -0.325203
							if( ad_mf > -28604.7 )
								if( mf <= 0.268383 )
									ret := 0.962963 // buy
								if( mf > 0.268383 )
									ret := 0.071429
						if( ad > -25907.2 )
							if( ad_mf <= -23327.2 )
								if( ema12 <= 0.124106 )
									ret := -0.750000 // sell
								if( ema12 > 0.124106 )
									ret := -1.000000 // sell
							if( ad_mf > -23327.2 )
								if( tema <= 61.4185 )
									ret := -0.842105 // sell
								if( tema > 61.4185 )
									ret := -0.354680
					if( ema3 > 76.8772 )
						if( ema2 <= 77.9737 )
							ret := 0.857143 // buy
						if( ema2 > 77.9737 )
							if( ad_mf <= -36914.1 )
								ret := -0.500000
							if( ad_mf > -36914.1 )
								if( ad_mf <= -19705.5 )
									ret := 0.100000
								if( ad_mf > -19705.5 )
									ret := -0.214286
			if( ad_mf > -13477.3 )
				if( ema2 <= 67.8053 )
					if( ad <= -12614.5 )
						if( ad_mf <= -12689.6 )
							if( ema12 <= -0.0432 )
								if( ad <= -13017.6 )
									ret := -0.272727
								if( ad > -13017.6 )
									ret := 0.774194 // buy
							if( ema12 > -0.0432 )
								if( ad <= -13172.3 )
									ret := -0.046512
								if( ad > -13172.3 )
									ret := -0.364807
						if( ad_mf > -12689.6 )
							if( ad <= -12655.8 )
								if( mf <= -0.090216 )
									ret := -0.920000 // sell
								if( mf > -0.090216 )
									ret := -0.666667
							if( ad > -12655.8 )
								ret := -0.312500
					if( ad > -12614.5 )
						if( ad <= -12535 )
							if( ad <= -12557.4 )
								if( ema12 <= 0.015391 )
									ret := 0.771930 // buy
								if( ema12 > 0.015391 )
									ret := -0.500000
							if( ad > -12557.4 )
								ret := 0.933333 // buy
						if( ad > -12535 )
							if( ema3 <= 62.9694 )
								if( ema13 <= -0.047351 )
									ret := -0.180636
								if( ema13 > -0.047351 )
									ret := 0.013328
							if( ema3 > 62.9694 )
								if( ema12 <= -0.016721 )
									ret := 0.162512
								if( ema12 > -0.016721 )
									ret := 0.020541
				if( ema2 > 67.8053 )
					if( ad_mf <= -6266.47 )
						if( tema <= 67.9641 )
							if( ema3 <= 67.939 )
								if( ad_mf <= -8480.88 )
									ret := -0.857143 // sell
								if( ad_mf > -8480.88 )
									ret := -0.416667
							if( ema3 > 67.939 )
								if( ad_mf <= -10498.9 )
									ret := -0.692308
								if( ad_mf > -10498.9 )
									ret := -0.150000
						if( tema > 67.9641 )
							if( mf <= -0.356482 )
								if( ema2 <= 70.8098 )
									ret := 0.848485 // buy
								if( ema2 > 70.8098 )
									ret := 0.125000
							if( mf > -0.356482 )
								if( ema12 <= 0.001143 )
									ret := -0.143820
								if( ema12 > 0.001143 )
									ret := -0.013789
					if( ad_mf > -6266.47 )
						if( ema12 <= 0.056624 )
							if( ema13 <= -0.023422 )
								if( ema3 <= 79.2844 )
									ret := -0.641509
								if( ema3 > 79.2844 )
									ret := -0.071429
							if( ema13 > -0.023422 )
								if( ad <= -6071.95 )
									ret := -0.148148
								if( ad > -6071.95 )
									ret := 0.285714
						if( ema12 > 0.056624 )
							if( mf <= 0.129644 )
								ret := -1.000000 // sell
							if( mf > 0.129644 )
								ret := -0.571429
		if( ad > -6032.94 )
			if( ema12 <= 0.00894 )
				if( ema12 <= -0.082138 )
					if( mf <= 0.075257 )
						if( ema13 <= -0.166992 )
							if( ad_mf <= 0.460571 )
								if( ema2 <= 64.0586 )
									ret := 0.469484
								if( ema2 > 64.0586 )
									ret := 0.057143
							if( ad_mf > 0.460571 )
								if( mf <= -0.515 )
									ret := -0.333333
								if( mf > -0.515 )
									ret := -0.944444 // sell
						if( ema13 > -0.166992 )
							if( ema2 <= 65.3371 )
								if( ema12 <= -0.092238 )
									ret := 0.854545 // buy
								if( ema12 > -0.092238 )
									ret := 0.426471
							if( ema2 > 65.3371 )
								if( ema3 <= 66.1311 )
									ret := -0.625000
								if( ema3 > 66.1311 )
									ret := 0.461538
					if( mf > 0.075257 )
						if( tema <= 62.0308 )
							if( mf <= 0.244615 )
								ret := 0.888889 // buy
							if( mf > 0.244615 )
								ret := 0.000000
						if( tema > 62.0308 )
							if( ema13 <= -0.182767 )
								if( ema3 <= 68.9772 )
									ret := 0.454545
								if( ema3 > 68.9772 )
									ret := 1.000000 // buy
							if( ema13 > -0.182767 )
								if( ad_mf <= -0.112616 )
									ret := 0.968085 // buy
								if( ad_mf > -0.112616 )
									ret := 0.666667
				if( ema12 > -0.082138 )
					if( ad_mf <= -799.794 )
						if( ad_mf <= -875.935 )
							if( mf <= 0.320799 )
								if( ema3 <= 72.6095 )
									ret := 0.082120
								if( ema3 > 72.6095 )
									ret := -0.059952
							if( mf > 0.320799 )
								if( tema <= 70.4884 )
									ret := 0.601626
								if( tema > 70.4884 )
									ret := -0.200000
						if( ad_mf > -875.935 )
							if( ad <= -872.004 )
								if( ema3 <= 64.73 )
									ret := -0.777778 // sell
								if( ema3 > 64.73 )
									ret := -1.000000 // sell
							if( ad > -872.004 )
								if( ema3 <= 61.4885 )
									ret := -0.666667
								if( ema3 > 61.4885 )
									ret := -0.062016
					if( ad_mf > -799.794 )
						if( tema <= 80.8658 )
							if( mf <= 0.874652 )
								if( ema12 <= -0.000535 )
									ret := 0.195476
								if( ema12 > -0.000535 )
									ret := 0.069455
							if( mf > 0.874652 )
								if( ema1 <= 64.4949 )
									ret := 0.314286
								if( ema1 > 64.4949 )
									ret := -0.724138 // sell
						if( tema > 80.8658 )
							if( ema2 <= 81.3766 )
								if( ema12 <= -0.017849 )
									ret := -0.875000 // sell
								if( ema12 > -0.017849 )
									ret := -0.355556
							if( ema2 > 81.3766 )
								if( ema2 <= 81.5837 )
									ret := 0.769231 // buy
								if( ema2 > 81.5837 )
									ret := -0.090909
			if( ema12 > 0.00894 )
				if( ad <= -88.8572 )
					if( tema <= 64.6257 )
						if( ema3 <= 60.2779 )
							if( ema2 <= 60.2288 )
								if( ad_mf <= -729.708 )
									ret := -0.063084
								if( ad_mf > -729.708 )
									ret := 0.287671
							if( ema2 > 60.2288 )
								if( ema1 <= 60.3304 )
									ret := 0.000000
								if( ema1 > 60.3304 )
									ret := -1.000000 // sell
						if( ema3 > 60.2779 )
							if( tema <= 60.8104 )
								if( ema1 <= 60.7448 )
									ret := 0.323529
								if( ema1 > 60.7448 )
									ret := 0.875000 // buy
							if( tema > 60.8104 )
								if( ema12 <= 0.174942 )
									ret := 0.137849
								if( ema12 > 0.174942 )
									ret := -0.692308
					if( tema > 64.6257 )
						if( mf <= 0.025286 )
							if( mf <= -0.271376 )
								if( ema2 <= 70.1859 )
									ret := -0.625000
								if( ema2 > 70.1859 )
									ret := 0.137255
							if( mf > -0.271376 )
								if( ad_mf <= -5959.27 )
									ret := -0.636364
								if( ad_mf > -5959.27 )
									ret := 0.189327
						if( mf > 0.025286 )
							if( ema12 <= 0.013852 )
								if( ema1 <= 69.9161 )
									ret := 0.436620
								if( ema1 > 69.9161 )
									ret := 0.043478
							if( ema12 > 0.013852 )
								if( ad_mf <= -572.387 )
									ret := -0.071233
								if( ad_mf > -572.387 )
									ret := -0.413534
				if( ad > -88.8572 )
					if( ema1 <= 67.781 )
						if( ema13 <= 0.112837 )
							if( mf <= 0.103192 )
								if( ema12 <= 0.030663 )
									ret := -0.146493
								if( ema12 > 0.030663 )
									ret := -0.424274
							if( mf > 0.103192 )
								if( ema3 <= 58.1354 )
									ret := 0.507042
								if( ema3 > 58.1354 )
									ret := -0.080900
						if( ema13 > 0.112837 )
							if( ema13 <= 0.127186 )
								if( ema1 <= 62.8992 )
									ret := -0.530303
								if( ema1 > 62.8992 )
									ret := -0.813187 // sell
							if( ema13 > 0.127186 )
								if( ema2 <= 63.5459 )
									ret := -0.327327
								if( ema2 > 63.5459 )
									ret := -0.549180
					if( ema1 > 67.781 )
						if( tema <= 80.4129 )
							if( tema <= 72.079 )
								if( mf <= 0.09664 )
									ret := -0.020370
								if( mf > 0.09664 )
									ret := 0.261036
							if( tema > 72.079 )
								if( tema <= 72.7117 )
									ret := -0.662651
								if( tema > 72.7117 )
									ret := 0.030238
						if( tema > 80.4129 )
							if( ema1 <= 80.4929 )
								if( ad_mf <= -0.182317 )
									ret := -0.500000
								if( ad_mf > -0.182317 )
									ret := -0.869565 // sell
							if( ema1 > 80.4929 )
								if( ema1 <= 80.6828 )
									ret := 0.384615
								if( ema1 > 80.6828 )
									ret := -0.548387
	if( ad > 5.97307 )
		if( ema12 <= 0.059734 )
			if( ad <= 338211 )
				if( ad <= 208.35 )
					if( ema1 <= 60.3083 )
						if( ema2 <= 59.5198 )
							if( ema12 <= -0.017833 )
								ret := -0.300000
							if( ema12 > -0.017833 )
								ret := 0.000000
						if( ema2 > 59.5198 )
							ret := 0.117647
					if( ema1 > 60.3083 )
						if( ema1 <= 78.8993 )
							if( ema2 <= 72.0407 )
								if( ad <= 55.7111 )
									ret := -0.063830
								if( ad > 55.7111 )
									ret := -0.609375
							if( ema2 > 72.0407 )
								ret := 0.133333
						if( ema1 > 78.8993 )
							ret := -0.857143 // sell
				if( ad > 208.35 )
					if( ema12 <= -0.075495 )
						if( ema3 <= 64.8842 )
							if( mf <= -0.178043 )
								if( ema3 <= 64.7758 )
									ret := 0.000000
								if( ema3 > 64.7758 )
									ret := 0.937500 // buy
							if( mf > -0.178043 )
								if( tema <= 59.746 )
									ret := 0.760870 // buy
								if( tema > 59.746 )
									ret := 0.351621
						if( ema3 > 64.8842 )
							if( ad <= 4924.07 )
								if( ema2 <= 74.0148 )
									ret := -0.074380
								if( ema2 > 74.0148 )
									ret := 0.483516
							if( ad > 4924.07 )
								if( ad <= 5423.28 )
									ret := -1.000000 // sell
								if( ad > 5423.28 )
									ret := -0.033623
					if( ema12 > -0.075495 )
						if( tema <= 72.3612 )
							if( ema1 <= 63.4459 )
								if( ema12 <= 0.025238 )
									ret := -0.004531
								if( ema12 > 0.025238 )
									ret := -0.098529
							if( ema1 > 63.4459 )
								if( ad_mf <= 23484.1 )
									ret := -0.046836
								if( ad_mf > 23484.1 )
									ret := -0.164413
						if( tema > 72.3612 )
							if( ad <= 6249.23 )
								if( ema2 <= 72.5684 )
									ret := 0.220930
								if( ema2 > 72.5684 )
									ret := -0.050876
							if( ad > 6249.23 )
								if( mf <= 0.182897 )
									ret := 0.027668
								if( mf > 0.182897 )
									ret := 0.184641
			if( ad > 338211 )
				if( ema13 <= -0.062488 )
					ret := -0.272727
				if( ema13 > -0.062488 )
					if( ad <= 844006 )
						if( tema <= 64.293 )
							ret := -1.000000 // sell
						if( tema > 64.293 )
							ret := -0.842105 // sell
					if( ad > 844006 )
						if( ad <= 1.14415e+06 )
							ret := 0.000000
						if( ad > 1.14415e+06 )
							ret := -0.937500 // sell
		if( ema12 > 0.059734 )
			if( ad_mf <= 3072.68 )
				if( mf <= 0.167628 )
					if( ema2 <= 76.4792 )
						if( ema12 <= 0.177127 )
							if( ema2 <= 65.4472 )
								if( ema1 <= 62.8355 )
									ret := -0.682927
								if( ema1 > 62.8355 )
									ret := -0.122449
							if( ema2 > 65.4472 )
								if( ema2 <= 70.8712 )
									ret := -0.858974 // sell
								if( ema2 > 70.8712 )
									ret := -0.368421
						if( ema12 > 0.177127 )
							ret := 0.200000
					if( ema2 > 76.4792 )
						if( ad_mf <= 2128.45 )
							if( ema12 <= 0.065758 )
								ret := 0.416667
							if( ema12 > 0.065758 )
								if( ema12 <= 0.08841 )
									ret := -0.285714
								if( ema12 > 0.08841 )
									ret := 0.142857
						if( ad_mf > 2128.45 )
							ret := -0.666667
				if( mf > 0.167628 )
					if( mf <= 0.272062 )
						if( ema2 <= 63.4774 )
							if( ad_mf <= 1271.68 )
								ret := -0.842105 // sell
							if( ad_mf > 1271.68 )
								if( ad_mf <= 2037.29 )
									ret := 0.250000
								if( ad_mf > 2037.29 )
									ret := -0.687500
						if( ema2 > 63.4774 )
							if( ema13 <= 0.114685 )
								if( ad <= 1232.76 )
									ret := -0.727273 // sell
								if( ad > 1232.76 )
									ret := 0.000000
							if( ema13 > 0.114685 )
								if( ad <= 759.5 )
									ret := -0.066667
								if( ad > 759.5 )
									ret := 0.465517
					if( mf > 0.272062 )
						if( ema2 <= 78.2763 )
							if( ema2 <= 70.4929 )
								if( ad_mf <= 2611.32 )
									ret := -0.197279
								if( ad_mf > 2611.32 )
									ret := -0.750000 // sell
							if( ema2 > 70.4929 )
								if( ema3 <= 76.5458 )
									ret := -0.827586 // sell
								if( ema3 > 76.5458 )
									ret := -0.500000
						if( ema2 > 78.2763 )
							if( ema12 <= 0.088266 )
								ret := 0.777778 // buy
							if( ema12 > 0.088266 )
								ret := -0.176471
			if( ad_mf > 3072.68 )
				if( mf <= 0.57746 )
					if( tema <= 64.3031 )
						if( mf <= 0.417602 )
							if( ema3 <= 63.8504 )
								if( ema2 <= 63.8851 )
									ret := -0.047668
								if( ema2 > 63.8851 )
									ret := -1.000000 // sell
							if( ema3 > 63.8504 )
								if( ad <= 17845.9 )
									ret := 0.655172
								if( ad > 17845.9 )
									ret := 0.000000
						if( mf > 0.417602 )
							if( ema3 <= 63.2181 )
								if( ema3 <= 59.3319 )
									ret := -0.272727
								if( ema3 > 59.3319 )
									ret := 0.607143
							if( ema3 > 63.2181 )
								if( ema13 <= 0.158807 )
									ret := 0.117647
								if( ema13 > 0.158807 )
									ret := -0.636364
					if( tema > 64.3031 )
						if( ad <= 4194.76 )
							if( ema2 <= 72.2332 )
								if( ema13 <= 0.258476 )
									ret := 0.854167 // buy
								if( ema13 > 0.258476 )
									ret := 0.600000
							if( ema2 > 72.2332 )
								if( ema2 <= 77.0008 )
									ret := 0.230769
								if( ema2 > 77.0008 )
									ret := 0.916667 // buy
						if( ad > 4194.76 )
							if( ad_mf <= 147168 )
								if( ad <= 140942 )
									ret := -0.147903
								if( ad > 140942 )
									ret := 0.948718 // buy
							if( ad_mf > 147168 )
								if( ad <= 245424 )
									ret := -0.872340 // sell
								if( ad > 245424 )
									ret := -0.040000
				if( mf > 0.57746 )
					if( ema2 <= 66.2333 )
						if( tema <= 60.3414 )
							ret := -0.909091 // sell
						if( tema > 60.3414 )
							if( ema12 <= 0.147807 )
								if( ema13 <= 0.122371 )
									ret := 0.785714 // buy
								if( ema13 > 0.122371 )
									ret := 0.000000
							if( ema12 > 0.147807 )
								if( ad_mf <= 18500.6 )
									ret := -0.272727
								if( ad_mf > 18500.6 )
									ret := -0.714286 // sell
					if( ema2 > 66.2333 )
						if( ema1 <= 73.0911 )
							if( ema1 <= 68.4573 )
								ret := -0.538462
							if( ema1 > 68.4573 )
								if( ema13 <= 0.349202 )
									ret := -1.000000 // sell
								if( ema13 > 0.349202 )
									ret := -0.928571 // sell
						if( ema1 > 73.0911 )
							ret := -0.391304
	
    ret //return
// Define expected timeframe based on the selected interval: 1Min pine_value: 1   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  1MIN !!"
if (str.tostring(timeframe.period) != "1")
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
float op_operation = decision_tree_0_PYPL_1Min_341810c5(mf, ad_mf, ad, ema12, ema3, ema13, tema, ema1, ema2)

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


