//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Chaikin_Money_Flow, L_Stochastic_RSI
// ID_model: AMZN_30Min_2CS0_1b15c454 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AMZN_30Min_2CS0_1b15c454", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AMZN_30Min_1b15c454(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( ad <= -82606.4 )
		if( ad_mf <= -286597 )
			if( mf <= -0.341017 )
				if( d <= 17.4844 )
					if( rsi1 <= 7.40899 )
						if( mf <= -0.52256 )
							ret := 0.818182 // buy
						if( mf > -0.52256 )
							ret := 0.125000
					if( rsi1 > 7.40899 )
						if( d <= 0.795368 )
							if( mf <= -0.476241 )
								ret := -0.166667
							if( mf > -0.476241 )
								ret := 0.444444
						if( d > 0.795368 )
							if( mf <= -0.485145 )
								if( ad_mf <= -909131 )
									ret := -0.656863
								if( ad_mf > -909131 )
									ret := -0.363636
							if( mf > -0.485145 )
								if( d_k <= -1.85863 )
									ret := 0.176471
								if( d_k > -1.85863 )
									ret := -0.395062
				if( d > 17.4844 )
					if( k <= 22.827 )
						if( smoothD_d <= 33.0572 )
							if( smoothD_d <= 31.5968 )
								if( rsi1 <= 21.2486 )
									ret := 0.400000
								if( rsi1 > 21.2486 )
									ret := 0.023077
							if( smoothD_d > 31.5968 )
								ret := -0.750000 // sell
						if( smoothD_d > 33.0572 )
							if( k <= 19.8827 )
								if( k <= 13.6718 )
									ret := 0.222222
								if( k > 13.6718 )
									ret := 1.000000 // buy
							if( k > 19.8827 )
								ret := 0.100000
					if( k > 22.827 )
						if( rsi1 <= 42.804 )
							if( ad <= -703055 )
								if( smoothK_k <= 22.1053 )
									ret := -0.500000
								if( smoothK_k > 22.1053 )
									ret := 0.150171
							if( ad > -703055 )
								if( ad_mf <= -394686 )
									ret := -0.643564
								if( ad_mf > -394686 )
									ret := -0.087500
						if( rsi1 > 42.804 )
							if( k <= 63.8013 )
								if( mf <= -0.447519 )
									ret := -0.788889 // sell
								if( mf > -0.447519 )
									ret := -0.440860
							if( k > 63.8013 )
								if( rsi1 <= 65.621 )
									ret := -0.099099
								if( rsi1 > 65.621 )
									ret := 0.409091
			if( mf > -0.341017 )
				if( smoothD_d <= 75.8631 )
					if( ad_mf <= -2.30072e+06 )
						if( ad_mf <= -2.36821e+06 )
							if( mf <= -0.177114 )
								if( smoothD_d <= 35.7847 )
									ret := -0.208531
								if( smoothD_d > 35.7847 )
									ret := 0.198630
							if( mf > -0.177114 )
								if( rsi1 <= 42.0847 )
									ret := 0.423398
								if( rsi1 > 42.0847 )
									ret := 0.076471
						if( ad_mf > -2.36821e+06 )
							if( smoothD_d <= 58.8716 )
								if( d_k <= 10.535 )
									ret := 0.938776 // buy
								if( d_k > 10.535 )
									ret := 0.777778 // buy
							if( smoothD_d > 58.8716 )
								if( ad_mf <= -2.31201e+06 )
									ret := -0.571429
								if( ad_mf > -2.31201e+06 )
									ret := 0.900000 // buy
					if( ad_mf > -2.30072e+06 )
						if( ad_mf <= -1.30014e+06 )
							if( ad_mf <= -2.28587e+06 )
								if( mf <= -0.12047 )
									ret := -1.000000 // sell
								if( mf > -0.12047 )
									ret := -0.800000 // sell
							if( ad_mf > -2.28587e+06 )
								if( d <= 60.7636 )
									ret := -0.166295
								if( d > 60.7636 )
									ret := 0.088235
						if( ad_mf > -1.30014e+06 )
							if( smoothK_k <= 67.3231 )
								if( rsi1 <= 24.8025 )
									ret := -0.120805
								if( rsi1 > 24.8025 )
									ret := 0.062098
							if( smoothK_k > 67.3231 )
								if( rsi1 <= 54.6203 )
									ret := 0.025424
								if( rsi1 > 54.6203 )
									ret := 0.402367
				if( smoothD_d > 75.8631 )
					if( smoothD_d <= 88.5407 )
						if( mf <= -0.276673 )
							if( d_k <= 12.6219 )
								if( ad_mf <= -1.34192e+06 )
									ret := 0.636364
								if( ad_mf > -1.34192e+06 )
									ret := -0.027778
							if( d_k > 12.6219 )
								ret := 0.750000 // buy
						if( mf > -0.276673 )
							if( ad <= -943531 )
								if( ad_mf <= -997562 )
									ret := -0.286697
								if( ad_mf > -997562 )
									ret := -0.969697 // sell
							if( ad > -943531 )
								if( rsi1 <= 51.8061 )
									ret := -0.337209
								if( rsi1 > 51.8061 )
									ret := 0.141304
					if( smoothD_d > 88.5407 )
						if( rsi1 <= 74.7051 )
							if( smoothD_d <= 88.7855 )
								ret := 0.562500
							if( smoothD_d > 88.7855 )
								if( smoothK_k <= 84.1466 )
									ret := -0.368421
								if( smoothK_k > 84.1466 )
									ret := 0.041985
						if( rsi1 > 74.7051 )
							if( d <= 98.0582 )
								if( mf <= 0.222663 )
									ret := 0.641026
								if( mf > 0.222663 )
									ret := 0.261905
							if( d > 98.0582 )
								if( d <= 98.858 )
									ret := -0.227273
								if( d > 98.858 )
									ret := 0.080000
		if( ad_mf > -286597 )
			if( ad <= -282263 )
				if( ad <= -282805 )
					if( rsi1 <= 32.399 )
						if( mf <= -0.15041 )
							ret := -0.900000 // sell
						if( mf > -0.15041 )
							ret := -1.000000 // sell
					if( rsi1 > 32.399 )
						if( rsi1 <= 45.6174 )
							ret := -0.333333
						if( rsi1 > 45.6174 )
							if( k <= 61.1451 )
								ret := -0.923077 // sell
							if( k > 61.1451 )
								ret := -0.750000 // sell
				if( ad > -282805 )
					if( ad_mf <= -282504 )
						ret := 0.230769
					if( ad_mf > -282504 )
						ret := -0.956522 // sell
			if( ad > -282263 )
				if( smoothK_k <= 35.8999 )
					if( ad <= -280244 )
						ret := 0.714286 // buy
					if( ad > -280244 )
						if( ad_mf <= -92107.5 )
							if( ad_mf <= -257265 )
								if( d_k <= 21.2175 )
									ret := -0.396000
								if( d_k > 21.2175 )
									ret := 0.888889 // buy
							if( ad_mf > -257265 )
								if( smoothK_k <= 35.7462 )
									ret := -0.120761
								if( smoothK_k > 35.7462 )
									ret := -0.846154 // sell
						if( ad_mf > -92107.5 )
							if( mf <= -0.309249 )
								if( ad <= -90704 )
									ret := -1.000000 // sell
								if( ad > -90704 )
									ret := 0.696970
							if( mf > -0.309249 )
								if( mf <= 0.41399 )
									ret := -0.444751
								if( mf > 0.41399 )
									ret := 0.538462
				if( smoothK_k > 35.8999 )
					if( ad_mf <= -272316 )
						if( smoothD_d <= 57.2523 )
							if( k <= 43.8037 )
								ret := -0.250000
							if( k > 43.8037 )
								if( ad_mf <= -275838 )
									ret := -0.727273 // sell
								if( ad_mf > -275838 )
									ret := -1.000000 // sell
						if( smoothD_d > 57.2523 )
							if( ad <= -277362 )
								if( rsi1 <= 60.927 )
									ret := 0.476190
								if( rsi1 > 60.927 )
									ret := -0.200000
							if( ad > -277362 )
								if( smoothD_d <= 69.9662 )
									ret := -0.400000
								if( smoothD_d > 69.9662 )
									ret := -0.923077 // sell
					if( ad_mf > -272316 )
						if( ad <= -270024 )
							if( k <= 69.9342 )
								ret := 0.818182 // buy
							if( k > 69.9342 )
								ret := 1.000000 // buy
						if( ad > -270024 )
							if( rsi1 <= 31.724 )
								if( smoothD_d <= 80.8647 )
									ret := 0.179389
								if( smoothD_d > 80.8647 )
									ret := 0.863636 // buy
							if( rsi1 > 31.724 )
								if( d_k <= -4.70012 )
									ret := -0.177590
								if( d_k > -4.70012 )
									ret := -0.015961
	if( ad > -82606.4 )
		if( smoothD_d <= 12.0412 )
			if( ad_mf <= 13946.8 )
				if( k <= 4.6975 )
					if( ad <= -2835.26 )
						if( ad <= -3054.9 )
							if( smoothK_k <= -1.73853 )
								if( d <= 1.03182 )
									ret := 0.289017
								if( d > 1.03182 )
									ret := 0.109422
							if( smoothK_k > -1.73853 )
								if( smoothD_d <= 7.54179 )
									ret := -0.080986
								if( smoothD_d > 7.54179 )
									ret := 0.492063
						if( ad > -3054.9 )
							if( smoothK_k <= -2.25328 )
								ret := -0.470588
							if( smoothK_k > -2.25328 )
								ret := -1.000000 // sell
					if( ad > -2835.26 )
						if( ad <= 871.372 )
							if( smoothK_k <= -2.98959 )
								if( rsi1 <= 41.2565 )
									ret := 0.110553
								if( rsi1 > 41.2565 )
									ret := 0.345324
							if( smoothK_k > -2.98959 )
								if( smoothD_d <= -2.10292 )
									ret := 0.611650
								if( smoothD_d > -2.10292 )
									ret := 0.370452
						if( ad > 871.372 )
							if( smoothD_d <= 7.43919 )
								if( rsi1 <= 39.5664 )
									ret := 0.305489
								if( rsi1 > 39.5664 )
									ret := 0.040909
							if( smoothD_d > 7.43919 )
								if( d <= 13.9532 )
									ret := -0.017544
								if( d > 13.9532 )
									ret := -0.500000
				if( k > 4.6975 )
					if( mf <= 0.077355 )
						if( ad <= -1053 )
							if( smoothD_d <= 8.88903 )
								if( ad <= -8907.11 )
									ret := -0.221766
								if( ad > -8907.11 )
									ret := -0.036638
							if( smoothD_d > 8.88903 )
								if( ad_mf <= -11743.5 )
									ret := 0.260870
								if( ad_mf > -11743.5 )
									ret := -0.062827
						if( ad > -1053 )
							if( smoothD_d <= 2.88534 )
								if( ad_mf <= 419.282 )
									ret := 0.426901
								if( ad_mf > 419.282 )
									ret := 0.072340
							if( smoothD_d > 2.88534 )
								if( rsi1 <= 39.8106 )
									ret := 0.127396
								if( rsi1 > 39.8106 )
									ret := -0.056338
					if( mf > 0.077355 )
						if( ad <= 698 )
							if( rsi1 <= 35.5279 )
								if( smoothD_d <= 4.85312 )
									ret := 0.504132
								if( smoothD_d > 4.85312 )
									ret := 0.114679
							if( rsi1 > 35.5279 )
								if( d_k <= -5.45794 )
									ret := 0.191781
								if( d_k > -5.45794 )
									ret := -0.024961
						if( ad > 698 )
							if( ad <= 1627 )
								if( k <= 17.3904 )
									ret := 0.606299
								if( k > 17.3904 )
									ret := -0.333333
							if( ad > 1627 )
								if( d <= 5.77644 )
									ret := -0.020833
								if( d > 5.77644 )
									ret := 0.196185
			if( ad_mf > 13946.8 )
				if( d_k <= -10.3839 )
					if( ad_mf <= 360839 )
						if( smoothD_d <= 10.4508 )
							if( d <= 8.31758 )
								ret := 0.687500
							if( d > 8.31758 )
								if( smoothK_k <= 18.2767 )
									ret := -0.416667
								if( smoothK_k > 18.2767 )
									ret := 0.357143
						if( smoothD_d > 10.4508 )
							if( k <= 25.6079 )
								ret := 0.333333
							if( k > 25.6079 )
								if( mf <= 0.104015 )
									ret := 0.176471
								if( mf > 0.104015 )
									ret := -0.739130 // sell
					if( ad_mf > 360839 )
						if( smoothK_k <= 22.7793 )
							if( smoothD_d <= 6.67554 )
								if( ad_mf <= 1.05104e+06 )
									ret := 0.100000
								if( ad_mf > 1.05104e+06 )
									ret := 0.680000
							if( smoothD_d > 6.67554 )
								if( ad_mf <= 1.74949e+06 )
									ret := 0.500000
								if( ad_mf > 1.74949e+06 )
									ret := -0.307692
						if( smoothK_k > 22.7793 )
							if( d_k <= -17.7446 )
								ret := 0.529412
							if( d_k > -17.7446 )
								ret := 0.842105 // buy
				if( d_k > -10.3839 )
					if( rsi1 <= 46.0184 )
						if( ad_mf <= 15074.4 )
							if( ad <= 14792.2 )
								if( d_k <= -0.882467 )
									ret := -0.714286 // sell
								if( d_k > -0.882467 )
									ret := -0.222222
							if( ad > 14792.2 )
								ret := -1.000000 // sell
						if( ad_mf > 15074.4 )
							if( rsi1 <= 4.01679 )
								ret := 0.857143 // buy
							if( rsi1 > 4.01679 )
								if( d_k <= -0.986438 )
									ret := -0.160000
								if( d_k > -0.986438 )
									ret := -0.053103
					if( rsi1 > 46.0184 )
						if( smoothK_k <= 0.803437 )
							if( d <= 1.50099 )
								if( smoothK_k <= -2.76544 )
									ret := 0.166667
								if( smoothK_k > -2.76544 )
									ret := 0.444444
							if( d > 1.50099 )
								if( mf <= 0.413815 )
									ret := -0.279412
								if( mf > 0.413815 )
									ret := 0.400000
						if( smoothK_k > 0.803437 )
							if( ad <= 1.55866e+06 )
								if( k <= 13.8989 )
									ret := 0.045098
								if( k > 13.8989 )
									ret := 0.244094
							if( ad > 1.55866e+06 )
								if( rsi1 <= 48.3079 )
									ret := 0.717949 // buy
								if( rsi1 > 48.3079 )
									ret := 0.265060
		if( smoothD_d > 12.0412 )
			if( rsi1 <= 61.3886 )
				if( d_k <= 0.296952 )
					if( ad <= 6.44578e+06 )
						if( ad <= 5.37091e+06 )
							if( d <= 84.4643 )
								if( mf <= 0.204564 )
									ret := -0.063885
								if( mf > 0.204564 )
									ret := 0.026340
							if( d > 84.4643 )
								if( k <= 87.4724 )
									ret := -0.489362
								if( k > 87.4724 )
									ret := -0.144554
						if( ad > 5.37091e+06 )
							if( rsi1 <= 55.075 )
								if( d <= 38.3826 )
									ret := 0.888889 // buy
								if( d > 38.3826 )
									ret := -0.272727
							if( rsi1 > 55.075 )
								ret := 0.937500 // buy
					if( ad > 6.44578e+06 )
						if( d_k <= -14.0965 )
							ret := -0.187500
						if( d_k > -14.0965 )
							if( rsi1 <= 50.6596 )
								if( ad_mf <= 8.04239e+06 )
									ret := -0.192308
								if( ad_mf > 8.04239e+06 )
									ret := -0.857143 // sell
							if( rsi1 > 50.6596 )
								if( k <= 60.4024 )
									ret := -0.625000
								if( k > 60.4024 )
									ret := -1.000000 // sell
				if( d_k > 0.296952 )
					if( rsi1 <= 30.7048 )
						if( mf <= 0.233509 )
							if( k <= 39.9267 )
								if( smoothK_k <= 31.2293 )
									ret := 0.084665
								if( smoothK_k > 31.2293 )
									ret := 0.523810
							if( k > 39.9267 )
								if( ad <= -642.333 )
									ret := 0.206897
								if( ad > -642.333 )
									ret := -0.333333
						if( mf > 0.233509 )
							if( ad_mf <= 216860 )
								if( d_k <= 13.5567 )
									ret := 0.728571 // buy
								if( d_k > 13.5567 )
									ret := 0.184211
							if( ad_mf > 216860 )
								ret := -0.130435
					if( rsi1 > 30.7048 )
						if( mf <= 0.234755 )
							if( ad_mf <= 2279.18 )
								if( ad <= 2197.14 )
									ret := 0.022890
								if( ad > 2197.14 )
									ret := 0.760000 // buy
							if( ad_mf > 2279.18 )
								if( d <= 92.0954 )
									ret := -0.045154
								if( d > 92.0954 )
									ret := 0.163793
						if( mf > 0.234755 )
							if( ad <= 1.82432e+06 )
								if( d <= 51.1939 )
									ret := 0.046494
								if( d > 51.1939 )
									ret := 0.227315
							if( ad > 1.82432e+06 )
								if( rsi1 <= 50.1462 )
									ret := -0.853659 // sell
								if( rsi1 > 50.1462 )
									ret := -0.356164
			if( rsi1 > 61.3886 )
				if( ad_mf <= 44932.2 )
					if( smoothD_d <= 93.9455 )
						if( ad_mf <= -0.203856 )
							if( ad <= -991.591 )
								if( ad <= -3539.76 )
									ret := 0.087098
								if( ad > -3539.76 )
									ret := -0.045242
							if( ad > -991.591 )
								if( d_k <= 6.66697 )
									ret := 0.084601
								if( d_k > 6.66697 )
									ret := 0.394410
						if( ad_mf > -0.203856 )
							if( mf <= 0.042725 )
								if( d <= 49.1465 )
									ret := -0.380062
								if( d > 49.1465 )
									ret := -0.101848
							if( mf > 0.042725 )
								if( k <= 67.7502 )
									ret := 0.139429
								if( k > 67.7502 )
									ret := -0.023239
					if( smoothD_d > 93.9455 )
						if( d <= 99.9881 )
							if( ad_mf <= -319.186 )
								if( ad_mf <= -978.505 )
									ret := 0.034826
								if( ad_mf > -978.505 )
									ret := 0.364583
							if( ad_mf > -319.186 )
								if( d <= 99.4658 )
									ret := -0.213605
								if( d > 99.4658 )
									ret := -0.531746
						if( d > 99.9881 )
							if( mf <= -0.241374 )
								ret := -0.111111
							if( mf > -0.241374 )
								if( mf <= -0.138302 )
									ret := 0.555556
								if( mf > -0.138302 )
									ret := 0.109091
				if( ad_mf > 44932.2 )
					if( rsi1 <= 75.8211 )
						if( ad <= 61426.8 )
							if( smoothK_k <= 91.827 )
								if( ad_mf <= 45408.3 )
									ret := 0.947368 // buy
								if( ad_mf > 45408.3 )
									ret := 0.268072
							if( smoothK_k > 91.827 )
								if( smoothD_d <= 92.0896 )
									ret := -0.388889
								if( smoothD_d > 92.0896 )
									ret := 0.041667
						if( ad > 61426.8 )
							if( d_k <= -12.7444 )
								if( ad_mf <= 477211 )
									ret := 0.018373
								if( ad_mf > 477211 )
									ret := -0.342857
							if( d_k > -12.7444 )
								if( d_k <= -1.30929 )
									ret := 0.117218
								if( d_k > -1.30929 )
									ret := -0.005880
					if( rsi1 > 75.8211 )
						if( ad_mf <= 216531 )
							if( k <= 83.1434 )
								if( mf <= 0.054738 )
									ret := -0.076923
								if( mf > 0.054738 )
									ret := 0.401146
							if( k > 83.1434 )
								if( d <= 68.4387 )
									ret := -0.478261
								if( d > 68.4387 )
									ret := 0.179183
						if( ad_mf > 216531 )
							if( mf <= -0.100841 )
								if( ad <= 286227 )
									ret := -0.617647
								if( ad > 286227 )
									ret := -0.109091
							if( mf > -0.100841 )
								if( k <= 77.3357 )
									ret := -0.021739
								if( k > 77.3357 )
									ret := 0.116592
	
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
float op_operation = decision_tree_0_AMZN_30Min_1b15c454(ad, mf, ad_mf, rsi1, smoothK_k, d_k, k, d, smoothD_d)

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


