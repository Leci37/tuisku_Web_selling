//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: MACD_ULT_MTF
// ID_model: XRPUSDT_5Min_1MAC_1603b5d7 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_XRPUSDT_5Min_1MAC_1603b5d7", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_XRPUSDT_5Min_1603b5d7(histB_IsUpInt, macd, histA_IsDownInt, hist, histB_IsDownInt, macd_IsAboveInt, signal, histA_IsUpInt, macd_IsBelowInt)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( macd <= -0.001272 )
		if( signal <= -0.003747 )
			if( hist <= 0.000997 )
				if( signal <= -0.01967 )
					ret := -1.000000 // sell
				if( signal > -0.01967 )
					if( macd <= -0.021578 )
						if( signal <= -0.017804 )
							ret := 0.750000 // buy
						if( signal > -0.017804 )
							ret := 1.000000 // buy
					if( macd > -0.021578 )
						if( hist <= -0.001658 )
							if( hist <= -0.002392 )
								if( macd <= -0.019221 )
									ret := -0.360000
								if( macd > -0.019221 )
									ret := 0.705357 // buy
							if( hist > -0.002392 )
								if( signal <= -0.004855 )
									ret := 0.253731
								if( signal > -0.004855 )
									ret := -0.500000
						if( hist > -0.001658 )
							if( signal <= -0.005492 )
								if( signal <= -0.011102 )
									ret := -0.030303
								if( signal > -0.011102 )
									ret := 0.643885
							if( signal > -0.005492 )
								if( histB_IsDownInt <= 0.5 )
									ret := 0.335038
								if( histB_IsDownInt > 0.5 )
									ret := 0.750000 // buy
			if( hist > 0.000997 )
				if( macd <= -0.009221 )
					if( macd <= -0.018001 )
						ret := -0.400000
					if( macd > -0.018001 )
						if( hist <= 0.002221 )
							ret := 1.000000 // buy
						if( hist > 0.002221 )
							if( hist <= 0.002714 )
								if( signal <= -0.017707 )
									ret := 0.250000
								if( signal > -0.017707 )
									ret := 0.000000
							if( hist > 0.002714 )
								if( signal <= -0.020513 )
									ret := 0.200000
								if( signal > -0.020513 )
									ret := 0.829787 // buy
				if( macd > -0.009221 )
					if( signal <= -0.004499 )
						if( signal <= -0.005391 )
							if( hist <= 0.001295 )
								if( macd <= -0.007332 )
									ret := 0.600000
								if( macd > -0.007332 )
									ret := -0.420000
							if( hist > 0.001295 )
								if( macd <= -0.008473 )
									ret := -0.785714 // sell
								if( macd > -0.008473 )
									ret := 0.300448
						if( signal > -0.005391 )
							if( signal <= -0.004573 )
								if( macd <= -0.004036 )
									ret := -0.909091 // sell
								if( macd > -0.004036 )
									ret := -0.129032
							if( signal > -0.004573 )
								if( signal <= -0.004553 )
									ret := -1.000000 // sell
								if( signal > -0.004553 )
									ret := -0.454545
					if( signal > -0.004499 )
						if( hist <= 0.001507 )
							if( macd <= -0.002917 )
								if( macd <= -0.003061 )
									ret := 0.736842 // buy
								if( macd > -0.003061 )
									ret := 0.950000 // buy
							if( macd > -0.002917 )
								if( histA_IsUpInt <= 0.5 )
									ret := -0.040000
								if( histA_IsUpInt > 0.5 )
									ret := 0.675676
						if( hist > 0.001507 )
							if( histA_IsUpInt <= 0.5 )
								if( signal <= -0.004198 )
									ret := 0.300000
								if( signal > -0.004198 )
									ret := -0.550000
							if( histA_IsUpInt > 0.5 )
								if( signal <= -0.004349 )
									ret := 0.750000 // buy
								if( signal > -0.004349 )
									ret := 0.150000
		if( signal > -0.003747 )
			if( macd <= -0.003216 )
				if( histB_IsUpInt <= 0.5 )
					if( hist <= -0.001424 )
						if( hist <= -0.001949 )
							if( hist <= -0.002002 )
								if( macd <= -0.00395 )
									ret := 0.697674
								if( macd > -0.00395 )
									ret := 0.057143
							if( hist > -0.002002 )
								if( signal <= -0.002865 )
									ret := -0.818182 // sell
								if( signal > -0.002865 )
									ret := 0.000000
						if( hist > -0.001949 )
							if( hist <= -0.001577 )
								if( hist <= -0.001602 )
									ret := 0.938144 // buy
								if( hist > -0.001602 )
									ret := 0.250000
							if( hist > -0.001577 )
								ret := 1.000000 // buy
					if( hist > -0.001424 )
						if( signal <= -0.002865 )
							if( signal <= -0.003449 )
								if( macd <= -0.003294 )
									ret := -0.118421
								if( macd > -0.003294 )
									ret := 0.827586 // buy
							if( signal > -0.003449 )
								if( macd <= -0.003736 )
									ret := 0.937500 // buy
								if( macd > -0.003736 )
									ret := 0.516129
						if( signal > -0.002865 )
							if( macd <= -0.004122 )
								ret := -1.000000 // sell
							if( macd > -0.004122 )
								if( macd <= -0.003254 )
									ret := 0.036232
								if( macd > -0.003254 )
									ret := 0.550000
				if( histB_IsUpInt > 0.5 )
					if( macd <= -0.004828 )
						if( macd <= -0.006356 )
							ret := -1.000000 // sell
						if( macd > -0.006356 )
							if( hist <= -0.002716 )
								if( hist <= -0.003016 )
									ret := -0.666667
								if( hist > -0.003016 )
									ret := 0.923077 // buy
							if( hist > -0.002716 )
								if( macd <= -0.004894 )
									ret := -0.170732
								if( macd > -0.004894 )
									ret := -0.888889 // sell
					if( macd > -0.004828 )
						if( macd <= -0.004742 )
							if( signal <= -0.003538 )
								ret := 0.750000 // buy
							if( signal > -0.003538 )
								ret := 1.000000 // buy
						if( macd > -0.004742 )
							if( signal <= -0.002895 )
								if( hist <= -8e-05 )
									ret := 0.160998
								if( hist > -8e-05 )
									ret := -0.933333 // sell
							if( signal > -0.002895 )
								if( signal <= -0.002764 )
									ret := 0.769231 // buy
								if( signal > -0.002764 )
									ret := 0.324638
			if( macd > -0.003216 )
				if( hist <= -5.6e-05 )
					if( histB_IsDownInt <= 0.5 )
						if( signal <= -0.002055 )
							if( signal <= -0.002074 )
								if( macd <= -0.002648 )
									ret := 0.298539
								if( macd > -0.002648 )
									ret := 0.096234
							if( signal > -0.002074 )
								if( macd <= -0.002516 )
									ret := 0.166667
								if( macd > -0.002516 )
									ret := 0.913043 // buy
						if( signal > -0.002055 )
							if( hist <= -0.000112 )
								if( macd <= -0.001355 )
									ret := 0.063671
								if( macd > -0.001355 )
									ret := 0.301205
							if( hist > -0.000112 )
								if( macd <= -0.001982 )
									ret := -0.277778
								if( macd > -0.001982 )
									ret := 0.395425
					if( histB_IsDownInt > 0.5 )
						if( macd <= -0.002243 )
							if( signal <= -0.001444 )
								if( hist <= -0.000769 )
									ret := -0.045614
								if( hist > -0.000769 )
									ret := 0.335238
							if( signal > -0.001444 )
								if( signal <= -0.000906 )
									ret := 0.712264 // buy
								if( signal > -0.000906 )
									ret := 0.139535
						if( macd > -0.002243 )
							if( macd <= -0.002159 )
								if( macd <= -0.002227 )
									ret := -0.600000
								if( macd > -0.002227 )
									ret := -0.105882
							if( macd > -0.002159 )
								if( macd <= -0.001371 )
									ret := 0.188277
								if( macd > -0.001371 )
									ret := 0.330341
				if( hist > -5.6e-05 )
					if( signal <= -0.001597 )
						if( macd <= -0.002451 )
							if( signal <= -0.003462 )
								if( signal <= -0.003511 )
									ret := 0.073770
								if( signal > -0.003511 )
									ret := 0.631579
							if( signal > -0.003462 )
								if( macd <= -0.002959 )
									ret := -0.346939
								if( macd > -0.002959 )
									ret := -0.047703
						if( macd > -0.002451 )
							if( macd <= -0.00216 )
								if( histA_IsDownInt <= 0.5 )
									ret := 0.161172
								if( histA_IsDownInt > 0.5 )
									ret := 0.563107
							if( macd > -0.00216 )
								if( hist <= 5e-06 )
									ret := -0.263158
								if( hist > 5e-06 )
									ret := 0.061668
					if( signal > -0.001597 )
						if( signal <= -0.00152 )
							if( histA_IsUpInt <= 0.5 )
								if( signal <= -0.001524 )
									ret := 0.280488
								if( signal > -0.001524 )
									ret := 1.000000 // buy
							if( histA_IsUpInt > 0.5 )
								if( signal <= -0.001544 )
									ret := 0.622047
								if( signal > -0.001544 )
									ret := 0.348485
						if( signal > -0.00152 )
							if( macd <= -0.001398 )
								if( macd <= -0.001446 )
									ret := -0.016000
								if( macd > -0.001446 )
									ret := 0.430769
							if( macd > -0.001398 )
								if( macd <= -0.001313 )
									ret := -0.171875
								if( macd > -0.001313 )
									ret := 0.196629
	if( macd > -0.001272 )
		if( macd <= 0.001013 )
			if( signal <= 0.000454 )
				if( macd <= -0.000617 )
					if( histB_IsDownInt <= 0.5 )
						if( hist <= -0.000802 )
							if( hist <= -0.00108 )
								if( macd <= -0.000965 )
									ret := 0.666667
								if( macd > -0.000965 )
									ret := -0.250000
							if( hist > -0.00108 )
								if( macd <= -0.001169 )
									ret := 0.411765
								if( macd > -0.001169 )
									ret := -0.432749
						if( hist > -0.000802 )
							if( signal <= -0.001157 )
								if( signal <= -0.001331 )
									ret := 0.038991
								if( signal > -0.001331 )
									ret := -0.055242
							if( signal > -0.001157 )
								if( signal <= -0.000996 )
									ret := 0.147812
								if( signal > -0.000996 )
									ret := 0.052312
					if( histB_IsDownInt > 0.5 )
						if( signal <= -0.001142 )
							if( hist <= -4.2e-05 )
								if( hist <= -7.9e-05 )
									ret := -0.285714
								if( hist > -7.9e-05 )
									ret := -0.791667 // sell
							if( hist > -4.2e-05 )
								if( signal <= -0.001167 )
									ret := 0.000000
								if( signal > -0.001167 )
									ret := -0.200000
						if( signal > -0.001142 )
							if( signal <= 1.6e-05 )
								if( signal <= -2.7e-05 )
									ret := 0.102947
								if( signal > -2.7e-05 )
									ret := -0.587302
							if( signal > 1.6e-05 )
								if( hist <= -0.000748 )
									ret := 0.209756
								if( hist > -0.000748 )
									ret := 0.794872 // buy
				if( macd > -0.000617 )
					if( hist <= -0.000404 )
						if( signal <= 0.000103 )
							if( histB_IsUpInt <= 0.5 )
								if( macd <= -0.000409 )
									ret := 0.168260
								if( macd > -0.000409 )
									ret := -0.165049
							if( histB_IsUpInt > 0.5 )
								if( signal <= -4.7e-05 )
									ret := -0.270677
								if( signal > -4.7e-05 )
									ret := 0.054945
						if( signal > 0.000103 )
							if( signal <= 0.000426 )
								if( hist <= -0.000865 )
									ret := 0.794872 // buy
								if( hist > -0.000865 )
									ret := 0.215971
							if( signal > 0.000426 )
								if( macd <= -0.000114 )
									ret := -0.162500
								if( macd > -0.000114 )
									ret := 0.252632
					if( hist > -0.000404 )
						if( signal <= -0.001423 )
							if( signal <= -0.001481 )
								if( macd <= 8.6e-05 )
									ret := -0.311881
								if( macd > 8.6e-05 )
									ret := 0.562500
							if( signal > -0.001481 )
								if( hist <= 0.000929 )
									ret := -0.100000
								if( hist > 0.000929 )
									ret := -0.787879 // sell
						if( signal > -0.001423 )
							if( signal <= -0.000935 )
								if( macd <= -8.1e-05 )
									ret := 0.168096
								if( macd > -8.1e-05 )
									ret := -0.121359
							if( signal > -0.000935 )
								if( hist <= 0.000236 )
									ret := 0.005952
								if( hist > 0.000236 )
									ret := 0.044867
			if( signal > 0.000454 )
				if( macd <= 0.000525 )
					if( hist <= -2e-05 )
						if( hist <= -0.000157 )
							if( signal <= 0.001141 )
								if( hist <= -0.00073 )
									ret := 0.011933
								if( hist > -0.00073 )
									ret := 0.150792
							if( signal > 0.001141 )
								if( macd <= 0.000507 )
									ret := 0.270916
								if( macd > 0.000507 )
									ret := 0.714286 // buy
						if( hist > -0.000157 )
							if( macd <= 0.000369 )
								if( macd <= 0.000362 )
									ret := -0.122222
								if( macd > 0.000362 )
									ret := -0.391304
							if( macd > 0.000369 )
								if( macd <= 0.000405 )
									ret := 0.236025
								if( macd > 0.000405 )
									ret := 0.033279
					if( hist > -2e-05 )
						if( histA_IsUpInt <= 0.5 )
							if( macd <= 0.000461 )
								if( macd <= 0.000455 )
									ret := 0.263158
								if( macd > 0.000455 )
									ret := -0.133333
							if( macd > 0.000461 )
								if( signal <= 0.000498 )
									ret := 0.507463
								if( signal > 0.000498 )
									ret := 0.259740
						if( histA_IsUpInt > 0.5 )
							if( signal <= 0.00047 )
								if( macd <= 0.000488 )
									ret := 0.000000
								if( macd > 0.000488 )
									ret := 0.526316
							if( signal > 0.00047 )
								if( macd <= 0.0005 )
									ret := 0.266667
								if( macd > 0.0005 )
									ret := -0.333333
				if( macd > 0.000525 )
					if( hist <= 0.000202 )
						if( histB_IsDownInt <= 0.5 )
							if( signal <= 0.002216 )
								if( hist <= -0.000444 )
									ret := -0.175758
								if( hist > -0.000444 )
									ret := -0.003846
							if( signal > 0.002216 )
								if( hist <= -0.001511 )
									ret := -0.937500 // sell
								if( hist > -0.001511 )
									ret := -0.250000
						if( histB_IsDownInt > 0.5 )
							if( hist <= -0.000253 )
								if( macd <= 0.000668 )
									ret := 0.318584
								if( macd > 0.000668 )
									ret := 0.119760
							if( hist > -0.000253 )
								if( macd <= 0.000929 )
									ret := 0.024054
								if( macd > 0.000929 )
									ret := 0.233728
					if( hist > 0.000202 )
						if( macd <= 0.001007 )
							if( hist <= 0.000342 )
								if( macd <= 0.000945 )
									ret := 0.163283
								if( macd > 0.000945 )
									ret := -0.047210
							if( hist > 0.000342 )
								if( signal <= 0.000572 )
									ret := 0.338308
								if( signal > 0.000572 )
									ret := 0.027778
						if( macd > 0.001007 )
							if( macd <= 0.001012 )
								if( hist <= 0.00023 )
									ret := 0.928571 // buy
								if( hist > 0.00023 )
									ret := 0.594595
							if( macd > 0.001012 )
								if( macd <= 0.001012 )
									ret := -0.200000
								if( macd > 0.001012 )
									ret := 0.666667
		if( macd > 0.001013 )
			if( histA_IsUpInt <= 0.5 )
				if( signal <= 0.003629 )
					if( signal <= 0.002895 )
						if( hist <= 0.001438 )
							if( hist <= -0.000823 )
								if( signal <= 0.002248 )
									ret := 0.563830
								if( signal > 0.002248 )
									ret := -0.009050
							if( hist > -0.000823 )
								if( macd <= 0.001916 )
									ret := -0.026815
								if( macd > 0.001916 )
									ret := 0.023161
						if( hist > 0.001438 )
							if( macd <= 0.005435 )
								if( hist <= 0.002044 )
									ret := 0.198347
								if( hist > 0.002044 )
									ret := 0.698413
							if( macd > 0.005435 )
								if( macd <= 0.006273 )
									ret := -1.000000 // sell
								if( macd > 0.006273 )
									ret := -0.750000 // sell
					if( signal > 0.002895 )
						if( macd <= 0.005678 )
							if( macd <= 0.001447 )
								if( hist <= -0.001736 )
									ret := -1.000000 // sell
								if( hist > -0.001736 )
									ret := -0.400000
							if( macd > 0.001447 )
								if( hist <= 0.001184 )
									ret := 0.168728
								if( hist > 0.001184 )
									ret := 0.563380
						if( macd > 0.005678 )
							if( signal <= 0.003312 )
								ret := -1.000000 // sell
							if( signal > 0.003312 )
								if( macd <= 0.006853 )
									ret := -0.600000
								if( macd > 0.006853 )
									ret := -1.000000 // sell
				if( signal > 0.003629 )
					if( histB_IsUpInt <= 0.5 )
						if( hist <= -0.001477 )
							if( macd <= 0.002171 )
								if( signal <= 0.003937 )
									ret := 0.666667
								if( signal > 0.003937 )
									ret := 1.000000 // buy
							if( macd > 0.002171 )
								if( signal <= 0.024929 )
									ret := 0.225806
								if( signal > 0.024929 )
									ret := -1.000000 // sell
						if( hist > -0.001477 )
							if( signal <= 0.006523 )
								if( macd <= 0.00364 )
									ret := -0.399123
								if( macd > 0.00364 )
									ret := -0.066049
							if( signal > 0.006523 )
								if( macd <= 0.008485 )
									ret := 0.307143
								if( macd > 0.008485 )
									ret := -0.349206
					if( histB_IsUpInt > 0.5 )
						if( signal <= 0.003879 )
							if( hist <= -0.000191 )
								if( hist <= -0.00095 )
									ret := -0.517241
								if( hist > -0.00095 )
									ret := -0.954545 // sell
							if( hist > -0.000191 )
								ret := 0.600000
						if( signal > 0.003879 )
							if( macd <= 0.003024 )
								if( macd <= 0.00274 )
									ret := -0.107143
								if( macd > 0.00274 )
									ret := 0.714286 // buy
							if( macd > 0.003024 )
								if( signal <= 0.004112 )
									ret := 0.115385
								if( signal > 0.004112 )
									ret := -0.396907
			if( histA_IsUpInt > 0.5 )
				if( macd <= 0.005371 )
					if( hist <= 0.000654 )
						if( signal <= 0.001505 )
							if( macd <= 0.001809 )
								if( macd <= 0.001271 )
									ret := -0.065495
								if( macd > 0.001271 )
									ret := 0.050989
							if( macd > 0.001809 )
								if( hist <= 0.000439 )
									ret := -0.062500
								if( hist > 0.000439 )
									ret := 0.647059
						if( signal > 0.001505 )
							if( signal <= 0.002258 )
								if( macd <= 0.00255 )
									ret := -0.314885
								if( macd > 0.00255 )
									ret := -0.863636 // sell
							if( signal > 0.002258 )
								if( signal <= 0.004677 )
									ret := 0.052478
								if( signal > 0.004677 )
									ret := 1.000000 // buy
					if( hist > 0.000654 )
						if( signal <= 0.003684 )
							if( signal <= 0.001282 )
								if( signal <= 0.000258 )
									ret := 0.066667
								if( signal > 0.000258 )
									ret := -0.248555
							if( signal > 0.001282 )
								if( macd <= 0.003243 )
									ret := 0.109489
								if( macd > 0.003243 )
									ret := -0.106762
						if( signal > 0.003684 )
							if( signal <= 0.004525 )
								if( macd <= 0.004998 )
									ret := -1.000000 // sell
								if( macd > 0.004998 )
									ret := -0.944444 // sell
							if( signal > 0.004525 )
								ret := -0.500000
				if( macd > 0.005371 )
					if( signal <= 0.006224 )
						if( macd <= 0.008012 )
							if( macd <= 0.007128 )
								if( hist <= 0.001868 )
									ret := -0.459459
								if( hist > 0.001868 )
									ret := -0.760000 // sell
							if( macd > 0.007128 )
								ret := -1.000000 // sell
						if( macd > 0.008012 )
							if( hist <= 0.006695 )
								ret := 1.000000 // buy
							if( hist > 0.006695 )
								ret := 0.428571
					if( signal > 0.006224 )
						if( signal <= 0.012209 )
							if( hist <= 0.001984 )
								if( hist <= 0.001537 )
									ret := 0.750000 // buy
								if( hist > 0.001537 )
									ret := 1.000000 // buy
							if( hist > 0.001984 )
								if( hist <= 0.004516 )
									ret := -0.500000
								if( hist > 0.004516 )
									ret := 1.000000 // buy
						if( signal > 0.012209 )
							ret := -1.000000 // sell
	
    ret //return
// Define expected timeframe based on the selected interval: 5Min pine_value: 5   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  5MIN !!"
if (str.tostring(timeframe.period) != "5")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator MACD_ULT_MTF 
//@version=5
//indicator title="CM_MacD_Ult_MTF", shorttitle="CM_Ult_MacD_MTF", overlay=false)

source = close
useCurrentRes = input(true, title="Use Current Chart Resolution?")
resCustom = input.timeframe(title="Use Different Timeframe? Uncheck Box Above", defval="60")
smd = input(true, title="Show MacD & Signal Line? Also Turn Off Dots Below")
sd = input(true, title="Show Dots When MacD Crosses Signal Line?")
sh = input(true, title="Show Histogram?")
macd_colorChange = input(true,title="Change MacD Line Color-Signal Line Cross?")
hist_colorChange = input(true,title="MacD Histogram 4 Colors?")

res = useCurrentRes ? timeframe.period : resCustom

fastLength = input.int(12, minval=1)
slowLength = input.int(26, minval=1)
signalLength = input.int(9, minval=1)

fastMA = ta.ema(source, fastLength)
slowMA = ta.ema(source, slowLength)

macd = fastMA - slowMA
signal = ta.sma(macd, signalLength)
hist = macd - signal

outMacD = request.security(syminfo.tickerid, res, macd)
outSignal = request.security(syminfo.tickerid, res, signal)
outHist = request.security(syminfo.tickerid, res, hist)

histA_IsUp = outHist > outHist[1] and outHist > 0
histA_IsDown = outHist < outHist[1] and outHist > 0
histB_IsDown = outHist < outHist[1] and outHist <= 0
histB_IsUp = outHist > outHist[1] and outHist <= 0

// MacD Color Definitions
macd_IsAbove = outMacD >= outSignal
macd_IsBelow = outMacD < outSignal

plot_color = hist_colorChange ? histA_IsUp ? color.aqua : histA_IsDown ? color.blue : histB_IsDown ? color.red : histB_IsUp ? color.maroon : color.yellow : color.gray
macd_color = macd_colorChange ? macd_IsAbove ? color.lime : color.red : color.red
signal_color = macd_colorChange ? macd_IsAbove ? color.yellow : color.yellow : color.lime

circleYPosition = outSignal

plot(smd and outMacD ? outMacD : na, title="MACD", color=macd_color, linewidth=4)
plot(smd and outSignal ? outSignal : na, title="Signal Line", color=signal_color, style=plot.style_line, linewidth=2)
plot(sh and outHist ? outHist : na, title="Histogram", color=plot_color, style=plot.style_histogram, linewidth=4)
plot(sd and ta.cross(outMacD, outSignal) ? circleYPosition : na, title="Cross", style=plot.style_circles, linewidth=4, color=macd_color)
hline(0, '0 Line', linestyle=hline.style_solid, linewidth=2, color=color.white)

histA_IsUpInt = histA_IsUp ? 1: 0
histA_IsDownInt = histA_IsDown ? 1: 0
histB_IsDownInt = histB_IsDown ? 1: 0
histB_IsUpInt = histB_IsUp ? 1: 0
macd_IsAboveInt = macd_IsAbove ? 1: 0
macd_IsBelowInt = macd_IsBelow ? 1: 0

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
float op_operation = decision_tree_0_XRPUSDT_5Min_1603b5d7(histB_IsUpInt, macd, histA_IsDownInt, hist, histB_IsDownInt, macd_IsAboveInt, signal, histA_IsUpInt, macd_IsBelowInt)

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


