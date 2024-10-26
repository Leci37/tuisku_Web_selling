//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_Money_Flow_Index, L_Triple_EMA
// ID_model: AAPL_5Min_2MT0_e37e7527 Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_AAPL_5Min_2MT0_e37e7527", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_AAPL_5Min_e37e7527(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, ema3, tema, ema2, ema12, ema13, ema1)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8,max_features=sqrt, min_samples_leaf=7,random_state=843828734)
	if( Positive_Money_Flow_Sum <= 9.44662e+08 )
		if( Negative_Money_Flow <= 72756.3 )
			if( MFI_Low <= 13.0268 )
				if( Raw_Money_Flow <= 1.64895e+08 )
					if( Positive_Money_Flow <= 8.84615e+07 )
						if( Positive_Money_Flow <= 440381 )
							if( ema2 <= 181.209 )
								if( MFI_High <= -47.2556 )
									ret := -0.020583
								if( MFI_High > -47.2556 )
									ret := -0.727273 // sell
							if( ema2 > 181.209 )
								if( Money_Flow_Ratio <= 0.415705 )
									ret := 0.120141
								if( Money_Flow_Ratio > 0.415705 )
									ret := -0.107317
						if( Positive_Money_Flow > 440381 )
							if( ema1 <= 182.345 )
								if( ema3 <= 170.271 )
									ret := -0.180064
								if( ema3 > 170.271 )
									ret := 0.024194
							if( ema1 > 182.345 )
								if( tema <= 217.969 )
									ret := -0.200925
								if( tema > 217.969 )
									ret := 0.016014
					if( Positive_Money_Flow > 8.84615e+07 )
						if( MFI_High <= -67.9916 )
							if( Raw_Money_Flow <= 1.20321e+08 )
								if( ema13 <= -0.710732 )
									ret := 1.000000 // buy
								if( ema13 > -0.710732 )
									ret := 0.636364
							if( Raw_Money_Flow > 1.20321e+08 )
								ret := 0.222222
						if( MFI_High > -67.9916 )
							if( MFI_Low <= -0.035126 )
								if( Negative_Money_Flow_Sum <= 1.08171e+09 )
									ret := -0.204545
								if( Negative_Money_Flow_Sum > 1.08171e+09 )
									ret := -0.707143 // sell
							if( MFI_Low > -0.035126 )
								if( Positive_Money_Flow_Sum <= 1.42527e+08 )
									ret := 0.769231 // buy
								if( Positive_Money_Flow_Sum > 1.42527e+08 )
									ret := -0.305707
				if( Raw_Money_Flow > 1.64895e+08 )
					if( Money_Flow_Ratio <= 0.306985 )
						if( ema3 <= 184.68 )
							if( Raw_Money_Flow <= 2.27116e+08 )
								if( ema3 <= 182.119 )
									ret := 0.142857
								if( ema3 > 182.119 )
									ret := -0.818182 // sell
							if( Raw_Money_Flow > 2.27116e+08 )
								if( ema2 <= 178.411 )
									ret := -0.470588
								if( ema2 > 178.411 )
									ret := -1.000000 // sell
						if( ema3 > 184.68 )
							if( Positive_Money_Flow_Sum <= 4.39174e+08 )
								if( Raw_Money_Flow <= 1.97874e+08 )
									ret := 0.053571
								if( Raw_Money_Flow > 1.97874e+08 )
									ret := 0.880952 // buy
							if( Positive_Money_Flow_Sum > 4.39174e+08 )
								if( Typical_Price <= 198.265 )
									ret := 0.062500
								if( Typical_Price > 198.265 )
									ret := -1.000000 // sell
					if( Money_Flow_Ratio > 0.306985 )
						if( Typical_Price <= 189.816 )
							if( MFI <= 25.1667 )
								ret := 0.166667
							if( MFI > 25.1667 )
								if( ema13 <= -0.62897 )
									ret := 1.000000 // buy
								if( ema13 > -0.62897 )
									ret := 0.487805
						if( Typical_Price > 189.816 )
							if( MFI <= 29.6359 )
								if( ema2 <= 199.922 )
									ret := -0.263158
								if( ema2 > 199.922 )
									ret := 0.720000 // buy
							if( MFI > 29.6359 )
								if( ema13 <= -0.202316 )
									ret := -0.478261
								if( ema13 > -0.202316 )
									ret := 0.666667
			if( MFI_Low > 13.0268 )
				if( ema1 <= 189.631 )
					if( Money_Flow_Ratio <= 161.088 )
						if( Negative_Money_Flow_Sum <= 3.92904e+06 )
							if( ema12 <= 0.106494 )
								if( Raw_Money_Flow <= 1.02443e+06 )
									ret := 0.018734
								if( Raw_Money_Flow > 1.02443e+06 )
									ret := -0.270270
							if( ema12 > 0.106494 )
								if( Positive_Money_Flow_Sum <= 6.78361e+06 )
									ret := -0.265734
								if( Positive_Money_Flow_Sum > 6.78361e+06 )
									ret := -0.509859
						if( Negative_Money_Flow_Sum > 3.92904e+06 )
							if( ema13 <= 0.504644 )
								if( Positive_Money_Flow_Sum <= 2.84606e+06 )
									ret := 0.459854
								if( Positive_Money_Flow_Sum > 2.84606e+06 )
									ret := 0.047742
							if( ema13 > 0.504644 )
								if( Raw_Money_Flow <= 1.49595e+08 )
									ret := -0.109929
								if( Raw_Money_Flow > 1.49595e+08 )
									ret := -0.677419
					if( Money_Flow_Ratio > 161.088 )
						if( ema2 <= 185.339 )
							ret := 1.000000 // buy
						if( ema2 > 185.339 )
							ret := 0.375000
				if( ema1 > 189.631 )
					if( Negative_Money_Flow_Sum <= 2.03679e+07 )
						if( Money_Flow_Ratio <= 4.32327 )
							if( Positive_Money_Flow_Sum <= 1.99345e+07 )
								if( ema13 <= 0.543518 )
									ret := 0.020927
								if( ema13 > 0.543518 )
									ret := 0.454545
							if( Positive_Money_Flow_Sum > 1.99345e+07 )
								if( Raw_Money_Flow <= 1.21344e+07 )
									ret := 0.269784
								if( Raw_Money_Flow > 1.21344e+07 )
									ret := 0.814286 // buy
						if( Money_Flow_Ratio > 4.32327 )
							if( ema1 <= 228.818 )
								if( ema13 <= 0.774711 )
									ret := -0.229333
								if( ema13 > 0.774711 )
									ret := 0.647727
							if( ema1 > 228.818 )
								if( ema1 <= 228.944 )
									ret := 0.761905 // buy
								if( ema1 > 228.944 )
									ret := 0.000000
					if( Negative_Money_Flow_Sum > 2.03679e+07 )
						if( MFI_High <= 5.69766 )
							if( ema13 <= 0.009524 )
								if( MFI_High <= -15.8869 )
									ret := -0.001698
								if( MFI_High > -15.8869 )
									ret := -0.371901
							if( ema13 > 0.009524 )
								if( Raw_Money_Flow <= 9.69502e+07 )
									ret := -0.217391
								if( Raw_Money_Flow > 9.69502e+07 )
									ret := 0.004315
						if( MFI_High > 5.69766 )
							if( Positive_Money_Flow_Sum <= 7.31792e+08 )
								if( Positive_Money_Flow_Sum <= 6.13002e+08 )
									ret := 0.022222
								if( Positive_Money_Flow_Sum > 6.13002e+08 )
									ret := 0.775000 // buy
							if( Positive_Money_Flow_Sum > 7.31792e+08 )
								if( Positive_Money_Flow_Sum <= 8.27905e+08 )
									ret := -0.710526 // sell
								if( Positive_Money_Flow_Sum > 8.27905e+08 )
									ret := 0.303571
		if( Negative_Money_Flow > 72756.3 )
			if( ema1 <= 171.729 )
				if( MFI_Low <= -13.0754 )
					if( Negative_Money_Flow_Sum <= 6.14254e+08 )
						if( MFI <= 2.0233 )
							ret := 0.000000
						if( MFI > 2.0233 )
							if( Raw_Money_Flow <= 864433 )
								if( MFI_High <= -75.9198 )
									ret := 0.375000
								if( MFI_High > -75.9198 )
									ret := 0.090909
							if( Raw_Money_Flow > 864433 )
								if( Negative_Money_Flow_Sum <= 4.09823e+07 )
									ret := 0.647059
								if( Negative_Money_Flow_Sum > 4.09823e+07 )
									ret := 0.950617 // buy
					if( Negative_Money_Flow_Sum > 6.14254e+08 )
						if( ema3 <= 171.22 )
							if( ema12 <= -0.320162 )
								if( Typical_Price <= 168.889 )
									ret := 0.000000
								if( Typical_Price > 168.889 )
									ret := -1.000000 // sell
							if( ema12 > -0.320162 )
								if( MFI_High <= -77.0841 )
									ret := 0.000000
								if( MFI_High > -77.0841 )
									ret := 0.285714
						if( ema3 > 171.22 )
							if( ema1 <= 170.935 )
								ret := 0.846154 // buy
							if( ema1 > 170.935 )
								ret := 0.307692
				if( MFI_Low > -13.0754 )
					if( Raw_Money_Flow <= 1.60561e+06 )
						if( ema13 <= -0.205729 )
							if( MFI_Low <= -1.64386 )
								if( Money_Flow_Ratio <= 0.154375 )
									ret := 1.000000 // buy
								if( Money_Flow_Ratio > 0.154375 )
									ret := 0.840000 // buy
							if( MFI_Low > -1.64386 )
								if( ema13 <= -0.285096 )
									ret := 0.666667
								if( ema13 > -0.285096 )
									ret := 0.043478
						if( ema13 > -0.205729 )
							if( MFI <= 87.5129 )
								if( Raw_Money_Flow <= 1.51642e+06 )
									ret := -0.004160
								if( Raw_Money_Flow > 1.51642e+06 )
									ret := -0.571429
							if( MFI > 87.5129 )
								if( Raw_Money_Flow <= 1.00215e+06 )
									ret := 0.000000
								if( Raw_Money_Flow > 1.00215e+06 )
									ret := 0.850000 // buy
					if( Raw_Money_Flow > 1.60561e+06 )
						if( Money_Flow_Ratio <= 2.75415 )
							if( ema12 <= 0.072964 )
								if( MFI <= 11.9261 )
									ret := -0.266055
								if( MFI > 11.9261 )
									ret := 0.207892
							if( ema12 > 0.072964 )
								if( Negative_Money_Flow_Sum <= 2.00571e+08 )
									ret := -0.253623
								if( Negative_Money_Flow_Sum > 2.00571e+08 )
									ret := 0.064286
						if( Money_Flow_Ratio > 2.75415 )
							if( Negative_Money_Flow <= 2.93255e+06 )
								if( tema <= 167.191 )
									ret := 0.583333
								if( tema > 167.191 )
									ret := 0.909091 // buy
							if( Negative_Money_Flow > 2.93255e+06 )
								if( Negative_Money_Flow_Sum <= 2.12181e+08 )
									ret := 0.027027
								if( Negative_Money_Flow_Sum > 2.12181e+08 )
									ret := 0.736842 // buy
			if( ema1 > 171.729 )
				if( Positive_Money_Flow_Sum <= 9.1567e+08 )
					if( Negative_Money_Flow <= 1.98088e+08 )
						if( MFI <= 6.91627 )
							if( ema12 <= -0.42265 )
								if( Negative_Money_Flow <= 2.92884e+07 )
									ret := 0.344828
								if( Negative_Money_Flow > 2.92884e+07 )
									ret := 0.826446 // buy
							if( ema12 > -0.42265 )
								if( ema1 <= 214.323 )
									ret := 0.072917
								if( ema1 > 214.323 )
									ret := 0.360759
						if( MFI > 6.91627 )
							if( Positive_Money_Flow <= 278181 )
								if( ema12 <= 0.564101 )
									ret := 0.036974
								if( ema12 > 0.564101 )
									ret := 0.692308
							if( Positive_Money_Flow > 278181 )
								if( ema1 <= 213.529 )
									ret := -0.220172
								if( ema1 > 213.529 )
									ret := 0.387978
					if( Negative_Money_Flow > 1.98088e+08 )
						if( Positive_Money_Flow_Sum <= 1.47979e+07 )
							if( Money_Flow_Ratio <= 0.026431 )
								if( Negative_Money_Flow_Sum <= 1.08612e+09 )
									ret := -0.877193 // sell
								if( Negative_Money_Flow_Sum > 1.08612e+09 )
									ret := -0.531915
							if( Money_Flow_Ratio > 0.026431 )
								if( ema3 <= 202.879 )
									ret := -0.434783
								if( ema3 > 202.879 )
									ret := 0.571429
						if( Positive_Money_Flow_Sum > 1.47979e+07 )
							if( Money_Flow_Ratio <= 0.201195 )
								if( ema13 <= -1.68178 )
									ret := 0.742857 // buy
								if( ema13 > -1.68178 )
									ret := 0.031332
							if( Money_Flow_Ratio > 0.201195 )
								if( MFI <= 40.1894 )
									ret := -0.332374
								if( MFI > 40.1894 )
									ret := -0.067989
				if( Positive_Money_Flow_Sum > 9.1567e+08 )
					if( Money_Flow_Ratio <= 0.670366 )
						if( Raw_Money_Flow <= 5.5283e+07 )
							ret := 0.277778
						if( Raw_Money_Flow > 5.5283e+07 )
							if( Negative_Money_Flow <= 3.28483e+08 )
								if( Money_Flow_Ratio <= 0.417755 )
									ret := -1.000000 // sell
								if( Money_Flow_Ratio > 0.417755 )
									ret := -0.476190
							if( Negative_Money_Flow > 3.28483e+08 )
								ret := 0.272727
					if( Money_Flow_Ratio > 0.670366 )
						if( Negative_Money_Flow <= 2.17334e+08 )
							if( ema12 <= 0.221348 )
								if( MFI <= 61.3343 )
									ret := 0.629630
								if( MFI > 61.3343 )
									ret := 0.128713
							if( ema12 > 0.221348 )
								if( Positive_Money_Flow_Sum <= 9.26274e+08 )
									ret := 1.000000 // buy
								if( Positive_Money_Flow_Sum > 9.26274e+08 )
									ret := 0.629630
						if( Negative_Money_Flow > 2.17334e+08 )
							if( ema2 <= 181.311 )
								ret := 0.125000
							if( ema2 > 181.311 )
								ret := -0.500000
	if( Positive_Money_Flow_Sum > 9.44662e+08 )
		if( Positive_Money_Flow_Sum <= 1.32737e+09 )
			if( ema1 <= 166.69 )
				if( MFI_Low <= 55.5435 )
					if( MFI_Low <= 45.3684 )
						ret := 0.611111
					if( MFI_Low > 45.3684 )
						ret := 1.000000 // buy
				if( MFI_Low > 55.5435 )
					ret := -0.230769
			if( ema1 > 166.69 )
				if( Negative_Money_Flow <= 9.79912e+07 )
					if( MFI_High <= -49.0754 )
						if( ema3 <= 175.465 )
							ret := 0.388889
						if( ema3 > 175.465 )
							if( Raw_Money_Flow <= 1.38935e+07 )
								if( MFI_High <= -51.6838 )
									ret := 0.000000
								if( MFI_High > -51.6838 )
									ret := -0.333333
							if( Raw_Money_Flow > 1.38935e+07 )
								if( ema13 <= 0.282823 )
									ret := -0.629630
								if( ema13 > 0.282823 )
									ret := -0.961538 // sell
					if( MFI_High > -49.0754 )
						if( Positive_Money_Flow_Sum <= 1.20663e+09 )
							if( Positive_Money_Flow_Sum <= 1.16081e+09 )
								if( MFI_Low <= 61.1242 )
									ret := -0.100814
								if( MFI_Low > 61.1242 )
									ret := 0.063008
							if( Positive_Money_Flow_Sum > 1.16081e+09 )
								if( Negative_Money_Flow_Sum <= 4.96504e+08 )
									ret := -0.164179
								if( Negative_Money_Flow_Sum > 4.96504e+08 )
									ret := 0.329670
						if( Positive_Money_Flow_Sum > 1.20663e+09 )
							if( MFI_High <= -13.9296 )
								if( ema12 <= -0.028358 )
									ret := 0.069231
								if( ema12 > -0.028358 )
									ret := -0.536977
							if( MFI_High > -13.9296 )
								if( Money_Flow_Ratio <= 2.63828 )
									ret := 0.244186
								if( Money_Flow_Ratio > 2.63828 )
									ret := -0.249330
				if( Negative_Money_Flow > 9.79912e+07 )
					if( Money_Flow_Ratio <= 0.327988 )
						if( ema12 <= -0.25734 )
							if( ema2 <= 183.054 )
								ret := -0.952381 // sell
							if( ema2 > 183.054 )
								ret := -0.200000
						if( ema12 > -0.25734 )
							ret := -0.950000 // sell
					if( Money_Flow_Ratio > 0.327988 )
						if( MFI <= 32.2203 )
							if( ema13 <= -0.048678 )
								if( Positive_Money_Flow_Sum <= 9.84513e+08 )
									ret := -0.333333
								if( Positive_Money_Flow_Sum > 9.84513e+08 )
									ret := 0.846154 // buy
							if( ema13 > -0.048678 )
								ret := -0.083333
						if( MFI > 32.2203 )
							if( ema13 <= 0.282187 )
								if( ema2 <= 201.439 )
									ret := -0.022222
								if( ema2 > 201.439 )
									ret := -0.403390
							if( ema13 > 0.282187 )
								if( ema1 <= 196.176 )
									ret := -0.468354
								if( ema1 > 196.176 )
									ret := 0.013889
		if( Positive_Money_Flow_Sum > 1.32737e+09 )
			if( Negative_Money_Flow <= 1.34809e+08 )
				if( Money_Flow_Ratio <= 4.2614 )
					if( MFI_High <= -2.00612 )
						if( Positive_Money_Flow <= 3.80927e+08 )
							if( ema12 <= 0.943804 )
								if( Positive_Money_Flow <= 2.93779e+08 )
									ret := -0.060395
								if( Positive_Money_Flow > 2.93779e+08 )
									ret := -0.549451
							if( ema12 > 0.943804 )
								if( ema12 <= 1.11574 )
									ret := -0.666667
								if( ema12 > 1.11574 )
									ret := -0.972222 // sell
						if( Positive_Money_Flow > 3.80927e+08 )
							if( MFI <= 47.6317 )
								if( MFI_High <= -39.2197 )
									ret := -0.666667
								if( MFI_High > -39.2197 )
									ret := -1.000000 // sell
							if( MFI > 47.6317 )
								if( ema12 <= 1.17614 )
									ret := 0.225275
								if( ema12 > 1.17614 )
									ret := 0.933333 // buy
					if( MFI_High > -2.00612 )
						if( ema2 <= 218.28 )
							if( Typical_Price <= 217.032 )
								if( Negative_Money_Flow_Sum <= 3.64861e+08 )
									ret := 0.578947
								if( Negative_Money_Flow_Sum > 3.64861e+08 )
									ret := -0.344729
							if( Typical_Price > 217.032 )
								ret := 0.650000
						if( ema2 > 218.28 )
							if( ema3 <= 227.837 )
								if( MFI <= 79.9219 )
									ret := -0.860000 // sell
								if( MFI > 79.9219 )
									ret := -0.500000
							if( ema3 > 227.837 )
								ret := 0.153846
				if( Money_Flow_Ratio > 4.2614 )
					if( Positive_Money_Flow_Sum <= 2.47341e+09 )
						if( Money_Flow_Ratio <= 17.887 )
							if( Negative_Money_Flow_Sum <= 1.78809e+08 )
								if( ema12 <= 0.343721 )
									ret := 0.104762
								if( ema12 > 0.343721 )
									ret := 0.836957 // buy
							if( Negative_Money_Flow_Sum > 1.78809e+08 )
								if( ema3 <= 190.825 )
									ret := 0.263339
								if( ema3 > 190.825 )
									ret := 0.049536
						if( Money_Flow_Ratio > 17.887 )
							if( ema3 <= 180.222 )
								if( Raw_Money_Flow <= 2.49556e+08 )
									ret := 0.000000
								if( Raw_Money_Flow > 2.49556e+08 )
									ret := -0.810811 // sell
							if( ema3 > 180.222 )
								if( Typical_Price <= 226.723 )
									ret := 0.052941
								if( Typical_Price > 226.723 )
									ret := 0.769231 // buy
					if( Positive_Money_Flow_Sum > 2.47341e+09 )
						if( Negative_Money_Flow_Sum <= 1.1489e+09 )
							if( Typical_Price <= 185.621 )
								if( Raw_Money_Flow <= 1.58248e+09 )
									ret := 0.057325
								if( Raw_Money_Flow > 1.58248e+09 )
									ret := -0.578947
							if( Typical_Price > 185.621 )
								if( Money_Flow_Ratio <= 192.272 )
									ret := -0.268562
								if( Money_Flow_Ratio > 192.272 )
									ret := 0.550000
						if( Negative_Money_Flow_Sum > 1.1489e+09 )
							if( MFI_Low <= 65.0412 )
								ret := 0.142857
							if( MFI_Low > 65.0412 )
								if( tema <= 215.75 )
									ret := 0.500000
								if( tema > 215.75 )
									ret := 1.000000 // buy
			if( Negative_Money_Flow > 1.34809e+08 )
				if( Typical_Price <= 172.75 )
					if( MFI_High <= -1.07448 )
						if( Positive_Money_Flow_Sum <= 1.74981e+09 )
							ret := -0.421053
						if( Positive_Money_Flow_Sum > 1.74981e+09 )
							if( ema3 <= 172.448 )
								ret := -0.956522 // sell
							if( ema3 > 172.448 )
								ret := -0.818182 // sell
					if( MFI_High > -1.07448 )
						ret := 0.227273
				if( Typical_Price > 172.75 )
					if( Raw_Money_Flow <= 6.41104e+08 )
						if( Negative_Money_Flow_Sum <= 3.31778e+08 )
							if( Negative_Money_Flow_Sum <= 2.86044e+08 )
								if( ema13 <= 0.491012 )
									ret := 1.000000 // buy
								if( ema13 > 0.491012 )
									ret := 0.363636
							if( Negative_Money_Flow_Sum > 2.86044e+08 )
								if( MFI_High <= 6.15684 )
									ret := 0.900000 // buy
								if( MFI_High > 6.15684 )
									ret := 1.000000 // buy
						if( Negative_Money_Flow_Sum > 3.31778e+08 )
							if( MFI <= 65.5448 )
								if( ema2 <= 185.605 )
									ret := 0.064327
								if( ema2 > 185.605 )
									ret := 0.445483
							if( MFI > 65.5448 )
								if( Money_Flow_Ratio <= 2.29573 )
									ret := -0.273810
								if( Money_Flow_Ratio > 2.29573 )
									ret := 0.122905
					if( Raw_Money_Flow > 6.41104e+08 )
						if( Typical_Price <= 208.055 )
							if( Negative_Money_Flow_Sum <= 2.87615e+09 )
								ret := 0.363636
							if( Negative_Money_Flow_Sum > 2.87615e+09 )
								ret := -0.285714
						if( Typical_Price > 208.055 )
							if( ema2 <= 219.119 )
								ret := -0.916667 // sell
							if( ema2 > 219.119 )
								ret := -0.600000
	
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
float op_operation = decision_tree_0_AAPL_5Min_e37e7527(Negative_Money_Flow, MFI_Low, Money_Flow_Ratio, MFI, Raw_Money_Flow, Positive_Money_Flow, Typical_Price, Positive_Money_Flow_Sum, MFI_High, Negative_Money_Flow_Sum, ema3, tema, ema2, ema12, ema13, ema1)

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


