//Welcome to © Tuisku Trading Strategy, a sophisticated and optimised solution created by the experienced team at Tuisku.eu. Our team of experts specialise in random forest AI, harnessing its powerful capabilities to improve trading performance.
//Tuisku's commitment to quality and innovation shines through in every aspect of this strategy.


// Technical base pattern: L_MA_Cross_SMA, L_Money_Flow_Index
// ID_model: SOLUSDT_15Min_2MM0_85f4dfbb Date Creation: 2024/10/18 Recommended expiry date : 2025/06/18
//@version=5
strategy("Tuisku_SOLUSDT_15Min_2MM0_85f4dfbb", overlay=true, margin_long=1000, margin_short=1000, pyramiding=1)
//RANDOM FOREST AI 
decision_tree_0_SOLUSDT_15Min_85f4dfbb(Short_Long_Diff, MA_Cross, Long_MA, Short_MA, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)=>
	var float ret = 0  // # DecisionTreeRegressor(criterion=friedman_mse, max_depth=8, max_features=0.7,min_samples_leaf=4, min_samples_split=5,random_state=843828734)
	if( Negative_Money_Flow <= 2.08387e+06 )
		if( Short_Long_Diff <= 1.06343 )
			if( Money_Flow_Ratio <= 29.7606 )
				if( Short_MA <= 142.316 )
					if( Negative_Money_Flow_Sum <= 4.04535e+07 )
						if( Positive_Money_Flow <= 2.27956e+07 )
							if( Positive_Money_Flow_Sum <= 5.33329e+07 )
								if( Raw_Money_Flow <= 1.37827e+07 )
									ret := 0.034132
								if( Raw_Money_Flow > 1.37827e+07 )
									ret := 0.428571
							if( Positive_Money_Flow_Sum > 5.33329e+07 )
								if( Raw_Money_Flow <= 2.59659e+06 )
									ret := 0.344444
								if( Raw_Money_Flow > 2.59659e+06 )
									ret := -0.108642
						if( Positive_Money_Flow > 2.27956e+07 )
							if( Raw_Money_Flow <= 3.59163e+07 )
								if( Negative_Money_Flow_Sum <= 1.59807e+07 )
									ret := 0.966667 // buy
								if( Negative_Money_Flow_Sum > 1.59807e+07 )
									ret := 0.446809
							if( Raw_Money_Flow > 3.59163e+07 )
								if( MFI_Low <= 62.4062 )
									ret := -0.750000 // sell
								if( MFI_Low > 62.4062 )
									ret := -0.250000
					if( Negative_Money_Flow_Sum > 4.04535e+07 )
						if( Raw_Money_Flow <= 7.36687e+07 )
							if( Negative_Money_Flow_Sum <= 1.96188e+08 )
								if( Negative_Money_Flow_Sum <= 1.54204e+08 )
									ret := 0.151382
								if( Negative_Money_Flow_Sum > 1.54204e+08 )
									ret := -0.198347
							if( Negative_Money_Flow_Sum > 1.96188e+08 )
								if( Money_Flow_Ratio <= 0.917637 )
									ret := 0.518248
								if( Money_Flow_Ratio > 0.917637 )
									ret := -0.437500
						if( Raw_Money_Flow > 7.36687e+07 )
							ret := -1.000000 // sell
				if( Short_MA > 142.316 )
					if( Short_Long_Diff <= -2.16995 )
						if( Money_Flow_Ratio <= 0.303421 )
							if( Long_MA <= 189.948 )
								if( Typical_Price <= 147.273 )
									ret := -0.250000
								if( Typical_Price > 147.273 )
									ret := -0.818182 // sell
							if( Long_MA > 189.948 )
								ret := 0.166667
						if( Money_Flow_Ratio > 0.303421 )
							if( Positive_Money_Flow_Sum <= 1.9184e+08 )
								if( Negative_Money_Flow_Sum <= 2.04037e+08 )
									ret := -0.348315
								if( Negative_Money_Flow_Sum > 2.04037e+08 )
									ret := 0.531915
							if( Positive_Money_Flow_Sum > 1.9184e+08 )
								if( Short_MA <= 174.267 )
									ret := -1.000000 // sell
								if( Short_MA > 174.267 )
									ret := -0.571429
					if( Short_Long_Diff > -2.16995 )
						if( MFI_Low <= 6.82822 )
							if( Positive_Money_Flow_Sum <= 3.94057e+07 )
								if( MFI_Low <= -0.139914 )
									ret := 0.306122
								if( MFI_Low > -0.139914 )
									ret := 0.027237
							if( Positive_Money_Flow_Sum > 3.94057e+07 )
								if( MFI_High <= -54.2642 )
									ret := 0.750000 // buy
								if( MFI_High > -54.2642 )
									ret := 0.214286
						if( MFI_Low > 6.82822 )
							if( Positive_Money_Flow_Sum <= 9.86537e+07 )
								if( Positive_Money_Flow_Sum <= 6.12827e+07 )
									ret := -0.003944
								if( Positive_Money_Flow_Sum > 6.12827e+07 )
									ret := -0.170595
							if( Positive_Money_Flow_Sum > 9.86537e+07 )
								if( Positive_Money_Flow <= 1.43492e+07 )
									ret := 0.382075
								if( Positive_Money_Flow > 1.43492e+07 )
									ret := -0.020000
			if( Money_Flow_Ratio > 29.7606 )
				if( MFI <= 98.1952 )
					if( Short_Long_Diff <= 0.188384 )
						ret := 0.750000 // buy
					if( Short_Long_Diff > 0.188384 )
						ret := 1.000000 // buy
				if( MFI > 98.1952 )
					ret := 0.142857
		if( Short_Long_Diff > 1.06343 )
			if( Raw_Money_Flow <= 7.67253e+06 )
				if( Negative_Money_Flow_Sum <= 1.51665e+07 )
					if( Money_Flow_Ratio <= 8.16115 )
						if( Positive_Money_Flow_Sum <= 7.90303e+07 )
							if( Raw_Money_Flow <= 4.03735e+06 )
								if( MFI_Low <= 63.8011 )
									ret := -0.267857
								if( MFI_Low > 63.8011 )
									ret := -0.695652
							if( Raw_Money_Flow > 4.03735e+06 )
								if( MFI <= 88.2075 )
									ret := 0.120690
								if( MFI > 88.2075 )
									ret := -0.857143 // sell
						if( Positive_Money_Flow_Sum > 7.90303e+07 )
							if( Typical_Price <= 125.982 )
								ret := -1.000000 // sell
							if( Typical_Price > 125.982 )
								if( Short_MA <= 153.456 )
									ret := -0.500000
								if( Short_MA > 153.456 )
									ret := -0.750000 // sell
					if( Money_Flow_Ratio > 8.16115 )
						if( Short_MA <= 67.078 )
							ret := -0.571429
						if( Short_MA > 67.078 )
							if( Short_Long_Diff <= 1.58353 )
								if( Short_Long_Diff <= 1.21805 )
									ret := 0.111111
								if( Short_Long_Diff > 1.21805 )
									ret := 0.750000 // buy
							if( Short_Long_Diff > 1.58353 )
								if( Negative_Money_Flow_Sum <= 5.84953e+06 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 5.84953e+06 )
									ret := -0.250000
				if( Negative_Money_Flow_Sum > 1.51665e+07 )
					if( Long_MA <= 46.3565 )
						if( Money_Flow_Ratio <= 2.40057 )
							ret := 1.000000 // buy
						if( Money_Flow_Ratio > 2.40057 )
							if( Negative_Money_Flow_Sum <= 1.57527e+07 )
								ret := 1.000000 // buy
							if( Negative_Money_Flow_Sum > 1.57527e+07 )
								if( Raw_Money_Flow <= 5.07618e+06 )
									ret := 0.125000
								if( Raw_Money_Flow > 5.07618e+06 )
									ret := -0.500000
					if( Long_MA > 46.3565 )
						if( Positive_Money_Flow_Sum <= 1.00961e+08 )
							if( Negative_Money_Flow_Sum <= 2.11799e+07 )
								if( Raw_Money_Flow <= 5.5254e+06 )
									ret := 0.319328
								if( Raw_Money_Flow > 5.5254e+06 )
									ret := -0.088235
							if( Negative_Money_Flow_Sum > 2.11799e+07 )
								if( Money_Flow_Ratio <= 3.23021 )
									ret := -0.141935
								if( Money_Flow_Ratio > 3.23021 )
									ret := 0.411765
						if( Positive_Money_Flow_Sum > 1.00961e+08 )
							if( Money_Flow_Ratio <= 1.51047 )
								if( Long_MA <= 128.364 )
									ret := 1.000000 // buy
								if( Long_MA > 128.364 )
									ret := 0.500000
							if( Money_Flow_Ratio > 1.51047 )
								if( Negative_Money_Flow_Sum <= 7.99039e+07 )
									ret := 0.292818
								if( Negative_Money_Flow_Sum > 7.99039e+07 )
									ret := -0.666667
			if( Raw_Money_Flow > 7.67253e+06 )
				if( Negative_Money_Flow_Sum <= 6.39048e+07 )
					if( Negative_Money_Flow_Sum <= 2.56637e+07 )
						if( Positive_Money_Flow <= 1.11027e+07 )
							if( Negative_Money_Flow_Sum <= 1.53311e+07 )
								if( MFI_High <= 0.512635 )
									ret := 0.600000
								if( MFI_High > 0.512635 )
									ret := -0.270270
							if( Negative_Money_Flow_Sum > 1.53311e+07 )
								if( Long_MA <= 166.815 )
									ret := -0.684932
								if( Long_MA > 166.815 )
									ret := -0.235294
						if( Positive_Money_Flow > 1.11027e+07 )
							if( Positive_Money_Flow_Sum <= 1.4376e+08 )
								if( Positive_Money_Flow_Sum <= 7.83886e+07 )
									ret := -0.264706
								if( Positive_Money_Flow_Sum > 7.83886e+07 )
									ret := 0.338129
							if( Positive_Money_Flow_Sum > 1.4376e+08 )
								if( Positive_Money_Flow_Sum <= 2.17212e+08 )
									ret := -0.584615
								if( Positive_Money_Flow_Sum > 2.17212e+08 )
									ret := 0.500000
					if( Negative_Money_Flow_Sum > 2.56637e+07 )
						if( Positive_Money_Flow_Sum <= 2.20286e+08 )
							if( Short_Long_Diff <= 2.07085 )
								if( Short_Long_Diff <= 1.19532 )
									ret := -0.085106
								if( Short_Long_Diff > 1.19532 )
									ret := -0.526132
							if( Short_Long_Diff > 2.07085 )
								if( Long_MA <= 147.074 )
									ret := 0.188406
								if( Long_MA > 147.074 )
									ret := -0.527778
						if( Positive_Money_Flow_Sum > 2.20286e+08 )
							if( Raw_Money_Flow <= 1.08016e+07 )
								ret := -0.250000
							if( Raw_Money_Flow > 1.08016e+07 )
								if( Positive_Money_Flow_Sum <= 2.4084e+08 )
									ret := -0.714286 // sell
								if( Positive_Money_Flow_Sum > 2.4084e+08 )
									ret := -1.000000 // sell
				if( Negative_Money_Flow_Sum > 6.39048e+07 )
					if( Typical_Price <= 133.852 )
						if( Negative_Money_Flow_Sum <= 7.33002e+07 )
							if( Short_MA <= 106.795 )
								if( Positive_Money_Flow <= 1.38213e+07 )
									ret := 0.400000
								if( Positive_Money_Flow > 1.38213e+07 )
									ret := -0.500000
							if( Short_MA > 106.795 )
								if( Short_Long_Diff <= 1.95611 )
									ret := 0.636364
								if( Short_Long_Diff > 1.95611 )
									ret := 0.971429 // buy
						if( Negative_Money_Flow_Sum > 7.33002e+07 )
							if( Raw_Money_Flow <= 1.00762e+07 )
								if( Short_Long_Diff <= 1.75682 )
									ret := 1.000000 // buy
								if( Short_Long_Diff > 1.75682 )
									ret := 0.571429
							if( Raw_Money_Flow > 1.00762e+07 )
								if( Raw_Money_Flow <= 2.42787e+07 )
									ret := -0.159091
								if( Raw_Money_Flow > 2.42787e+07 )
									ret := 0.619048
					if( Typical_Price > 133.852 )
						if( Positive_Money_Flow <= 3.00447e+07 )
							if( MFI_High <= -10.0686 )
								if( Negative_Money_Flow_Sum <= 6.58204e+07 )
									ret := 0.500000
								if( Negative_Money_Flow_Sum > 6.58204e+07 )
									ret := -0.285714
							if( MFI_High > -10.0686 )
								if( Positive_Money_Flow_Sum <= 2.58847e+08 )
									ret := -0.133333
								if( Positive_Money_Flow_Sum > 2.58847e+08 )
									ret := 0.611111
						if( Positive_Money_Flow > 3.00447e+07 )
							if( MFI_Low <= 36.8126 )
								ret := -1.000000 // sell
							if( MFI_Low > 36.8126 )
								if( Short_Long_Diff <= 3.19222 )
									ret := -0.666667
								if( Short_Long_Diff > 3.19222 )
									ret := -0.166667
	if( Negative_Money_Flow > 2.08387e+06 )
		if( MFI <= 41.73 )
			if( Typical_Price <= 145.11 )
				if( Negative_Money_Flow_Sum <= 1.05992e+08 )
					if( MFI <= 28.5986 )
						if( Negative_Money_Flow <= 1.04209e+07 )
							if( Positive_Money_Flow_Sum <= 2.55528e+07 )
								if( Short_MA <= 33.5896 )
									ret := 0.176000
								if( Short_MA > 33.5896 )
									ret := 0.035500
							if( Positive_Money_Flow_Sum > 2.55528e+07 )
								if( Long_MA <= 130.581 )
									ret := -0.448276
								if( Long_MA > 130.581 )
									ret := 0.281250
						if( Negative_Money_Flow > 1.04209e+07 )
							if( Positive_Money_Flow_Sum <= 3.21425e+07 )
								if( Negative_Money_Flow <= 1.10688e+07 )
									ret := 0.622642
								if( Negative_Money_Flow > 1.10688e+07 )
									ret := 0.246073
							if( Positive_Money_Flow_Sum > 3.21425e+07 )
								if( Short_Long_Diff <= -0.943988 )
									ret := 0.250000
								if( Short_Long_Diff > -0.943988 )
									ret := -0.823529 // sell
					if( MFI > 28.5986 )
						if( Raw_Money_Flow <= 1.64935e+07 )
							if( Negative_Money_Flow <= 2.852e+06 )
								if( Short_Long_Diff <= 0.050952 )
									ret := 0.128114
								if( Short_Long_Diff > 0.050952 )
									ret := -0.228571
							if( Negative_Money_Flow > 2.852e+06 )
								if( Negative_Money_Flow <= 8.66979e+06 )
									ret := 0.214286
								if( Negative_Money_Flow > 8.66979e+06 )
									ret := 0.326389
						if( Raw_Money_Flow > 1.64935e+07 )
							if( MFI <= 33.3877 )
								if( Positive_Money_Flow_Sum <= 2.18338e+07 )
									ret := 0.500000
								if( Positive_Money_Flow_Sum > 2.18338e+07 )
									ret := -0.723404 // sell
							if( MFI > 33.3877 )
								if( Raw_Money_Flow <= 2.37444e+07 )
									ret := 0.000000
								if( Raw_Money_Flow > 2.37444e+07 )
									ret := 0.736842 // buy
				if( Negative_Money_Flow_Sum > 1.05992e+08 )
					if( MFI <= 27.9938 )
						if( Typical_Price <= 125.92 )
							if( Typical_Price <= 108.179 )
								if( Raw_Money_Flow <= 7.28323e+06 )
									ret := 0.111111
								if( Raw_Money_Flow > 7.28323e+06 )
									ret := 0.632653
							if( Typical_Price > 108.179 )
								if( Negative_Money_Flow_Sum <= 1.13885e+08 )
									ret := 0.384615
								if( Negative_Money_Flow_Sum > 1.13885e+08 )
									ret := 0.884058 // buy
						if( Typical_Price > 125.92 )
							if( Short_Long_Diff <= -2.2846 )
								if( Negative_Money_Flow_Sum <= 2.09446e+08 )
									ret := -0.485714
								if( Negative_Money_Flow_Sum > 2.09446e+08 )
									ret := 0.655172
							if( Short_Long_Diff > -2.2846 )
								if( Positive_Money_Flow_Sum <= 1.02874e+08 )
									ret := 0.597222
								if( Positive_Money_Flow_Sum > 1.02874e+08 )
									ret := -1.000000 // sell
					if( MFI > 27.9938 )
						if( Negative_Money_Flow <= 1.42088e+07 )
							if( Money_Flow_Ratio <= 0.571356 )
								if( Raw_Money_Flow <= 9.59889e+06 )
									ret := -0.277108
								if( Raw_Money_Flow > 9.59889e+06 )
									ret := 0.462963
							if( Money_Flow_Ratio > 0.571356 )
								if( Typical_Price <= 138.618 )
									ret := 0.890411 // buy
								if( Typical_Price > 138.618 )
									ret := 0.500000
						if( Negative_Money_Flow > 1.42088e+07 )
							if( Raw_Money_Flow <= 2.93844e+07 )
								if( Long_MA <= 54.0949 )
									ret := 1.000000 // buy
								if( Long_MA > 54.0949 )
									ret := -0.273684
							if( Raw_Money_Flow > 2.93844e+07 )
								if( Negative_Money_Flow_Sum <= 2.85681e+08 )
									ret := 0.851852 // buy
								if( Negative_Money_Flow_Sum > 2.85681e+08 )
									ret := 0.258065
			if( Typical_Price > 145.11 )
				if( Negative_Money_Flow_Sum <= 4.11922e+08 )
					if( Positive_Money_Flow_Sum <= 1.46868e+07 )
						if( MFI_High <= -67.2575 )
							if( Negative_Money_Flow_Sum <= 1.003e+08 )
								if( Negative_Money_Flow <= 1.09632e+07 )
									ret := 0.607143
								if( Negative_Money_Flow > 1.09632e+07 )
									ret := -0.428571
							if( Negative_Money_Flow_Sum > 1.003e+08 )
								if( Negative_Money_Flow_Sum <= 1.13676e+08 )
									ret := 0.933333 // buy
								if( Negative_Money_Flow_Sum > 1.13676e+08 )
									ret := 0.250000
						if( MFI_High > -67.2575 )
							if( Short_Long_Diff <= 0.094805 )
								if( Short_Long_Diff <= -1.93952 )
									ret := -1.000000 // sell
								if( Short_Long_Diff > -1.93952 )
									ret := 0.102041
							if( Short_Long_Diff > 0.094805 )
								if( Negative_Money_Flow_Sum <= 2.02754e+07 )
									ret := 0.000000
								if( Negative_Money_Flow_Sum > 2.02754e+07 )
									ret := 0.840000 // buy
					if( Positive_Money_Flow_Sum > 1.46868e+07 )
						if( Positive_Money_Flow_Sum <= 1.35417e+08 )
							if( Short_Long_Diff <= -0.443983 )
								if( Positive_Money_Flow <= 19628.4 )
									ret := 0.037806
								if( Positive_Money_Flow > 19628.4 )
									ret := -0.517241
							if( Short_Long_Diff > -0.443983 )
								if( Negative_Money_Flow <= 4.55748e+06 )
									ret := 0.072072
								if( Negative_Money_Flow > 4.55748e+06 )
									ret := -0.194175
						if( Positive_Money_Flow_Sum > 1.35417e+08 )
							if( Long_MA <= 156.402 )
								if( MFI_Low <= 15.0254 )
									ret := 0.000000
								if( MFI_Low > 15.0254 )
									ret := -1.000000 // sell
							if( Long_MA > 156.402 )
								if( Short_Long_Diff <= -3.13185 )
									ret := 0.029412
								if( Short_Long_Diff > -3.13185 )
									ret := 0.615385
				if( Negative_Money_Flow_Sum > 4.11922e+08 )
					ret := 1.000000 // buy
		if( MFI > 41.73 )
			if( Positive_Money_Flow_Sum <= 1.07863e+07 )
				if( Negative_Money_Flow <= 4.06185e+06 )
					if( Short_Long_Diff <= -0.025571 )
						if( Long_MA <= 38.1528 )
							if( Positive_Money_Flow_Sum <= 9.03884e+06 )
								if( Negative_Money_Flow_Sum <= 9.33282e+06 )
									ret := 0.700000 // buy
								if( Negative_Money_Flow_Sum > 9.33282e+06 )
									ret := 0.962963 // buy
							if( Positive_Money_Flow_Sum > 9.03884e+06 )
								if( Short_MA <= 29.6204 )
									ret := 0.909091 // buy
								if( Short_MA > 29.6204 )
									ret := 0.250000
						if( Long_MA > 38.1528 )
							if( Long_MA <= 38.9107 )
								ret := -0.333333
							if( Long_MA > 38.9107 )
								if( Positive_Money_Flow_Sum <= 9.3233e+06 )
									ret := 0.812500 // buy
								if( Positive_Money_Flow_Sum > 9.3233e+06 )
									ret := 0.000000
					if( Short_Long_Diff > -0.025571 )
						if( MA_Cross <= 1.92358 )
							if( MFI_High <= -29.0989 )
								if( Typical_Price <= 27.0694 )
									ret := -0.222222
								if( Typical_Price > 27.0694 )
									ret := 0.275000
							if( MFI_High > -29.0989 )
								if( Positive_Money_Flow_Sum <= 9.48709e+06 )
									ret := 0.608696
								if( Positive_Money_Flow_Sum > 9.48709e+06 )
									ret := 0.117647
						if( MA_Cross > 1.92358 )
							ret := -0.857143 // sell
				if( Negative_Money_Flow > 4.06185e+06 )
					if( Negative_Money_Flow_Sum <= 8.29778e+06 )
						ret := 0.166667
					if( Negative_Money_Flow_Sum > 8.29778e+06 )
						if( Raw_Money_Flow <= 5.13451e+06 )
							if( Short_Long_Diff <= -0.045972 )
								ret := -1.000000 // sell
							if( Short_Long_Diff > -0.045972 )
								ret := -0.166667
						if( Raw_Money_Flow > 5.13451e+06 )
							ret := -1.000000 // sell
			if( Positive_Money_Flow_Sum > 1.07863e+07 )
				if( Short_MA <= 111.888 )
					if( Negative_Money_Flow_Sum <= 4.50446e+07 )
						if( Negative_Money_Flow_Sum <= 3.51951e+07 )
							if( Short_Long_Diff <= 1.16602 )
								if( Positive_Money_Flow_Sum <= 3.46832e+07 )
									ret := 0.045878
								if( Positive_Money_Flow_Sum > 3.46832e+07 )
									ret := 0.166667
							if( Short_Long_Diff > 1.16602 )
								if( Typical_Price <= 58.1836 )
									ret := 0.161765
								if( Typical_Price > 58.1836 )
									ret := -0.414286
						if( Negative_Money_Flow_Sum > 3.51951e+07 )
							if( Positive_Money_Flow_Sum <= 8.85612e+07 )
								if( Positive_Money_Flow_Sum <= 6.91027e+07 )
									ret := -0.116522
								if( Positive_Money_Flow_Sum > 6.91027e+07 )
									ret := 0.529412
							if( Positive_Money_Flow_Sum > 8.85612e+07 )
								if( Short_MA <= 89.7249 )
									ret := -0.645161
								if( Short_MA > 89.7249 )
									ret := -0.037037
					if( Negative_Money_Flow_Sum > 4.50446e+07 )
						if( Negative_Money_Flow_Sum <= 8.37891e+07 )
							if( Money_Flow_Ratio <= 0.754249 )
								if( Short_Long_Diff <= -0.236507 )
									ret := -0.481481
								if( Short_Long_Diff > -0.236507 )
									ret := 0.000000
							if( Money_Flow_Ratio > 0.754249 )
								if( Money_Flow_Ratio <= 0.886505 )
									ret := 0.529101
								if( Money_Flow_Ratio > 0.886505 )
									ret := 0.253247
						if( Negative_Money_Flow_Sum > 8.37891e+07 )
							if( Short_Long_Diff <= 1.00683 )
								if( Long_MA <= 105.979 )
									ret := -0.615385
								if( Long_MA > 105.979 )
									ret := 0.250000
							if( Short_Long_Diff > 1.00683 )
								if( Negative_Money_Flow <= 1.09663e+07 )
									ret := 0.250000
								if( Negative_Money_Flow > 1.09663e+07 )
									ret := 0.933333 // buy
				if( Short_MA > 111.888 )
					if( Raw_Money_Flow <= 2.17149e+07 )
						if( Negative_Money_Flow_Sum <= 2.25132e+08 )
							if( Positive_Money_Flow_Sum <= 1.45691e+08 )
								if( Negative_Money_Flow <= 1.21887e+07 )
									ret := 0.014796
								if( Negative_Money_Flow > 1.21887e+07 )
									ret := -0.209544
							if( Positive_Money_Flow_Sum > 1.45691e+08 )
								if( Negative_Money_Flow <= 2.06179e+07 )
									ret := 0.253933
								if( Negative_Money_Flow > 2.06179e+07 )
									ret := -0.433333
						if( Negative_Money_Flow_Sum > 2.25132e+08 )
							if( MFI_Low <= 22.9971 )
								ret := 0.428571
							if( MFI_Low > 22.9971 )
								if( Short_MA <= 176.693 )
									ret := -1.000000 // sell
								if( Short_MA > 176.693 )
									ret := -0.500000
					if( Raw_Money_Flow > 2.17149e+07 )
						if( Positive_Money_Flow_Sum <= 1.86352e+08 )
							if( Negative_Money_Flow_Sum <= 5.95192e+07 )
								if( Positive_Money_Flow_Sum <= 1.26112e+08 )
									ret := -0.666667
								if( Positive_Money_Flow_Sum > 1.26112e+08 )
									ret := 0.714286 // buy
							if( Negative_Money_Flow_Sum > 5.95192e+07 )
								if( MA_Cross <= 78.532 )
									ret := 0.646552
								if( MA_Cross > 78.532 )
									ret := -0.750000 // sell
						if( Positive_Money_Flow_Sum > 1.86352e+08 )
							if( Raw_Money_Flow <= 2.25635e+07 )
								if( MFI_Low <= 40.4853 )
									ret := 0.750000 // buy
								if( MFI_Low > 40.4853 )
									ret := 1.000000 // buy
							if( Raw_Money_Flow > 2.25635e+07 )
								if( Short_Long_Diff <= 3.46714 )
									ret := -0.201754
								if( Short_Long_Diff > 3.46714 )
									ret := 0.368421
	
    ret //return
// Define expected timeframe based on the selected interval: 15Min pine_value: 15   Trigger an alert and show a label if the timeframe is incorrect
alert_message_time_wrong = "The current candle TIMEframe is WRONG: "+ str.tostring(timeframe.period) + ", CHANGE it to the CORRECT one:  15MIN !!"
if (str.tostring(timeframe.period) != "15")
    alert(alert_message_time_wrong, alert.freq_once_per_bar_close)
    label.new(bar_index -300, high+30, text = alert_message_time_wrong, style = label.style_label_down,size = size.large, color = color.red, textcolor = color.white)
    log.error(alert_message_time_wrong)

//CODE associated with the technical indicator L_MA_Cross_SMA 
//@version=5
//indicator title="MA Cross", overlay=true)

shortlen = input.int(9, title="Short MA Length", minval=1)
longlen = input.int(21, title="Long MA Length", minval=1)

// Calculate the short and long simple moving averages (SMA)
Short_MA = ta.sma(close, shortlen)
Long_MA = ta.sma(close, longlen)

// Calculate the difference between short MA and long MA
Short_Long_Diff = Short_MA - Long_MA

// Identify crossover points where short MA crosses above or below the long MA
MA_Cross = ta.valuewhen(ta.crossover(Short_MA, Long_MA), Short_MA, 0)

// Plot the results
plot(Short_MA, color=color.orange, title="Short MA")
plot(Long_MA, color=color.green, title="Long MA")
plotshape(na(MA_Cross) ? na : MA_Cross, style=shape.cross, location=location.absolute, color=color.blue, title="Cross")


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
float op_operation = decision_tree_0_SOLUSDT_15Min_85f4dfbb(Short_Long_Diff, MA_Cross, Long_MA, Short_MA, Negative_Money_Flow_Sum, MFI_High, Raw_Money_Flow, MFI_Low, Negative_Money_Flow, Money_Flow_Ratio, Typical_Price, MFI, Positive_Money_Flow_Sum, Positive_Money_Flow)

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


